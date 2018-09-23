package com.github.moraesofia.planilha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Código que, quando executado, oferece o seguinte comportamento esperado: (a)
 * o programa baixa o arquivo CSV conforme uma URL fornecida (por exemplo,
 * aquela acima); (b) lista, em ordem decrescente, por estado, os totais de
 * instituições de educação superior; (c) o programa deve assumir que as 10
 * primeiras linhas do arquivo CSV devem ser ignoradas, enquanto a décima
 * primeira linha contém o cabeçalho e, a partir da décima segunda, seguem os
 * dados propriamente ditos conforme as várias colunas presente no arquivo cuja
 * URL foi fornecida acima; (d) o programa deve usar a URL fornecida na linha de
 * comandos, quando for executado e, caso o argumento não seja fornecido, deve
 * usar aquela citada acima.
 * 
 * 
 * @author sofia
 *
 */
public class Aplicacao {

	/**
	 * Vetor com as siglas dos 27 estados brasileiros. Deve estar em sincronia com o
	 * vetor instituicoes.
	 */
	private static String[] siglas = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
			"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	/**
	 * Vetor com 27 espaços, representando o numero de instituições de ensino
	 * superior dos 27 estados brasileiros. Deve estar em sincronia com o vetor
	 * siglas.
	 */
	private static int[] instituicoes = new int[27];

	/**
	 * Url com a planilha contendo os instituições de ensino superior brasileiras.
	 */
	private static String urlPadrao = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";

	/**
	 * Tamanho do cabeçalho padrão na planilha sendo trabalhada.
	 */
	private static int linhasPraPular = 11;

	/**
	 * Coluna contendo as siglas dos estados brasileiros na planilha sendo
	 * trabalhada.
	 */
	private static int colunaPadrao = 9;

	public static void main(String[] args) throws Exception {
		String urlPlanilha;
		if (args.length == 1 && args[0].startsWith("http")) {
			urlPlanilha = args[0];
		} else if (args.length == 0) {
			urlPlanilha = urlPadrao;
		} else {
			throw new IllegalArgumentException("ENTRADA INVALIDA");
		}

		List<String> bufSaida = new ArrayList<>();

		System.out.println("Lendo planilha, aguarde ...");
		lePlanilhaUrl(urlPlanilha, bufSaida);

		for (String row : bufSaida) {
			String[] teste = row.split(";");

			identificaEstado(teste[colunaPadrao]);
		}

		ordenaVetores();

		System.out.println("Total de instituições de educação superior por estado (ordem decrescente):");
		for (int i = 0; i < instituicoes.length - 1; i++) {
			System.out.println(siglas[i] + " : " + instituicoes[i]);
		}

	}

	/**
	 * Este metodo lê uma planilha provida por uma url, colocando suas linhas em uma
	 * lista de Strings.
	 * 
	 * @param urlPlanilha
	 * @param bufSaida
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	private static void lePlanilhaUrl(String urlPlanilha, List<String> bufSaida)
			throws MalformedURLException, IOException {
		try {
			URL url = new URL(urlPlanilha);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String linha;
			int contador = 0;
			while ((linha = br.readLine()) != null) {
				if (contador < linhasPraPular) {
					contador++;
				} else {
					bufSaida.add(linha + "\n");
				}
			}
			br.close();
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
			throw new MalformedURLException("URL INVÁLIDA");
		} catch (IOException io) {
			io.printStackTrace();
			throw new IOException("NAO FOI POSSÍVEL LER A PLANILHA");
		}
	}

	/**
	 * Este metodo ordena simultâneamente os vetores contendo os estados e o numero
	 * de instituições de ensino superior que possuem em ordem decrescente.
	 * 
	 * @param instituicoes
	 */
	private static void ordenaVetores() {

		for (int i = 1; i < instituicoes.length; i++) {
			for (int j = 0; j < i; j++) {
				if (instituicoes[i] > instituicoes[j]) {
					int temp = instituicoes[i];
					instituicoes[i] = instituicoes[j];
					instituicoes[j] = temp;

					String prov = siglas[i];
					siglas[i] = siglas[j];
					siglas[j] = prov;
				}
			}
		}
	}

	/**
	 * Este metodo identifica a sigla correspondente a um estado brasileiro inserida
	 * e aumenta o numero de instituições referente àquele estado.
	 * 
	 * @param sigla
	 * @param instituicoes
	 * @return
	 */
	public static void identificaEstado(String sigla) {

		switch (sigla) {

		case "AC":
			instituicoes[0] += 1;
			break;
		case "AL":
			instituicoes[1] += 1;
			break;
		case "AP":
			instituicoes[2] += 1;
			break;
		case "AM":
			instituicoes[3] += 1;
			break;
		case "BA":
			instituicoes[4] += 1;
			break;
		case "CE":
			instituicoes[5] += 1;
			break;
		case "DF":
			instituicoes[6] += 1;
			break;
		case "ES":
			instituicoes[7] += 1;
			break;
		case "GO":
			instituicoes[8] += 1;
			break;
		case "MA":
			instituicoes[9] += 1;
			break;
		case "MT":
			instituicoes[10] += 1;
			break;
		case "MS":
			instituicoes[11] += 1;
			break;
		case "MG":
			instituicoes[12] += 1;
			break;
		case "PA":
			instituicoes[13] += 1;
			break;
		case "PB":
			instituicoes[14] += 1;
			break;
		case "PR":
			instituicoes[15] += 1;
			break;
		case "PE":
			instituicoes[16] += 1;
			break;
		case "PI":
			instituicoes[17] += 1;
			break;
		case "RJ":
			instituicoes[18] += 1;
			break;
		case "RN":
			instituicoes[19] += 1;
			break;
		case "RS":
			instituicoes[20] += 1;
			break;
		case "RO":
			instituicoes[21] += 1;
			break;
		case "RR":
			instituicoes[22] += 1;
			break;
		case "SC":
			instituicoes[23] += 1;
			break;
		case "SP":
			instituicoes[24] += 1;
			break;
		case "SE":
			instituicoes[25] += 1;
			break;
		case "TO":
			instituicoes[26] += 1;
			break;
		default:
			break;
		}
	}

}
