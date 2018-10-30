package com.github.moraesofia.cnes;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * Classe main do programa "cnes".
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
public final class Main {

    /**
     * Construtor privado da classe Main.
     */
    private Main() {
    }

    /**
     * Nome do csv com estabelecimentos a ser procurado.
     */
    private static final String CSV_PADRAO = "tbEstabelecimento";

    /**
     * Numero de linhas a serem puladas na leitura do csv.
     */
    private static final int PULAR_LINHAS = 1;

    /**
     * Coluna do csv contendo o codigo do estabelecimento.
     */
    private static final int COLUNA_COD = 1;

    /**
     * Coluna do csv contendo a razao social do estabelecimento.
     */
    private static final int COLUNA_RS = 5;

    /**
     * Coluna do csv contendo a latitude do estabelecimento.
     */
    private static final int COLUNA_LAT = 39;

    /**
     * Coluna do csv contendo a longitude do estabelecimento.
     */
    private static final int COLUNA_LON = 40;

    /**
     * Função main do programa.
     *
     * @param args argumentos inseridos via linha de comando.
     * @throws IOException exceção do tipo I/O.
     */
    public static void main(final String[] args) throws IOException {
        String urlArquivo, arquivoJson;
        boolean csvEncontrado = false;

        if (args.length == 2 && args[1].endsWith(".json")) {
            urlArquivo = args[0];
            arquivoJson = args[1];
        } else {
            String comoUsar = "**Para usar esse programa, "
                    + "forneca os seguintes argumentos:\n"
                    + "1- Url com arquivo .zip\n"
                    + "2- Arquivo .json para depositar resultados";
            throw new IllegalArgumentException("ENTRADA INVALIDA\n" + comoUsar);
        }

        try {
            System.out.println("Conectando Url...");
            URLConnection connection = conectURL(urlArquivo);

            ZipInputStream str = new ZipInputStream(
                    connection.getInputStream());
            ZipEntry entry;
            System.out.println("Lendo arquivo Zip ...");

            /**
             * Aqui, o .zip eh vasculhado em busca da planilha de
             * estabelecimentos. Se a planilha for encontrada, o programa
             * realiza sua leitura e gera um json com o conteúdo relevantes.
             */
            search: while ((entry = str.getNextEntry()) != null) {
                if (entry.getName().contains(CSV_PADRAO)) {
                    System.out.println(
                            "Arquivo " + entry.getName() + " encontrado!");
                    csvEncontrado = true;

                    List<String> bufSaida = leituraCsvCompactado(str);

                    List<Estabelecimento> listEst = extairEstabelecimentos(
                            bufSaida);

                    String conteudo = gerarGson(listEst);

                    criarJsonExterno(conteudo, arquivoJson);

                    break search;

                } else {
                    continue;
                }

            }
            str.close();

        } catch (IOException e) {
            throw new IOException();
        }

        if (!csvEncontrado) {
            throw new IllegalArgumentException(
                    "CSV DE ESTABELECIMENTOS NAO ENCONTRADO\n");
        }
        System.out.println("fim do programa");

    }

    /**
     * Metodo que realiza uma conexao com uma url inserida nos argumentos do
     * programa.
     *
     * @param urlArquivo url com o arquivo.
     * @return conexao com URL.
     * @throws IOException exceção do tipo I/O.
     */
    public static URLConnection conectURL(final String urlArquivo)
            throws IOException {

        try {
            URL url = new URL(urlArquivo);
            URLConnection connection = url.openConnection();
            return connection;
        } catch (IOException IO) {
            throw new IOException("NAO FOI POSSIVEL CONECTAR COM URL");
        }

    }

    /**
     * Metodo que cria um arquivo .json externo, inserido nos argumentos do
     * programa.
     *
     * @param conteudo do json a ser criado.
     * @param arquivo json a ser criado, com o conteudo disponibilizado.
     * @throws IOException exceção do tipo I/O.
     */
    public static void criarJsonExterno(final String conteudo,
            final String arquivo) throws IOException {
        try (FileWriter fw = new FileWriter(arquivo)) {
            fw.write(conteudo);
            System.out.println("Relatorio " + arquivo + " gerado");

        } catch (IOException ioe) {
            throw new IOException("NAO FOI POSSIVEL CRIAR JSON");
        }
    }

    /**
     * Metodo que utiliza a biblioteca GSON para criar um JSON atraves de uma
     * lista de objetos do tipo Estabelecimento.
     *
     * @param listEst lista de objetos Estabelecimento.
     * @return Sring com o json criado.
     */
    public static String gerarGson(final List<Estabelecimento> listEst) {
        Type type = new TypeToken<List<Estabelecimento>>() {
        }.getType();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(listEst, type).toString();
    }

    /**
     * Metodo que recebe uma lista com strings, provenientes de um csv, e separa
     * as colunas relevantes em uma lista de objetos do tipo Estabelecimento.
     *
     * @param bufSaida lista com as linhas extraidas do csv.
     * @return lista com os objetos Estabelecimento formados através das
     *         informações relevantes do csv.
     */
    public static List<Estabelecimento> extairEstabelecimentos(
            final List<String> bufSaida) {
        List<Estabelecimento> listEst = new ArrayList<>();
        for (String row : bufSaida) {
            String[] tupla = row.split(";");
            Estabelecimento est = new Estabelecimento(tupla[COLUNA_COD],
                    tupla[COLUNA_RS], tupla[COLUNA_LAT], tupla[COLUNA_LON]);
            listEst.add(est);
        }
        return listEst;
    }

    /**
     * Metodo que realiza a leitura de um csv compactado.
     *
     * @param str input stream de um arquivo zip.
     * @return lista com as linhas do csv lido.
     * @throws IOException exceção do tipo I/O.
     */
    public static List<String> leituraCsvCompactado(final ZipInputStream str)
            throws IOException {
        String linha;
        BufferedReader br = new BufferedReader(new InputStreamReader(str));
        List<String> bufSaida = new ArrayList<>();
        int contador = 0;
        System.out.println("Lendo .csv, pode demorar alguns segundos...");
        while ((linha = br.readLine()) != null) {

            if (contador < PULAR_LINHAS) {
                contador++;
            } else {
                bufSaida.add(linha.replace("\"", "") + "\n");
            }
        }
        br.close();
        return bufSaida;
    }
}
