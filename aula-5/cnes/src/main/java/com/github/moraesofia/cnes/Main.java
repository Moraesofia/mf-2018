package com.github.moraesofia.cnes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {

	private static final String URL_PADRAO = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201809.ZIP";

	private static final String CSV_PADRAO = "tbEstabelecimento";

	private static final String ARQUIVO_DEFAULT = "web-app/estabelecimentos.json";

	public static void main(String[] args) throws Exception {
		String urlArquivo;
		String arquivoJason;

		if (args.length == 2) {
			urlArquivo = args[0];
			arquivoJason = args[1];
		} else {
			String comoUsar = "**Para usar esse programa, forneca os seguintes argumentos:\n"
					+ "1- Url com arquivo .zip\n" + "2- Arquivo JSON para depositar resultados";
			throw new IllegalArgumentException("ENTRADA INVALIDA\n" + comoUsar);
		}

		urlArquivo = URL_PADRAO;
		URL url;
		try {
			System.out.println("Conectando Url...");
			url = new URL(urlArquivo);
			URLConnection connection = url.openConnection();

			ZipInputStream str = new ZipInputStream(connection.getInputStream());
			ZipEntry entry;
			System.out.println("Lendo arquivo Zip ...");
			while ((entry = str.getNextEntry()) != null) {
				if (entry.getName().contains(CSV_PADRAO)) {
					System.out.println("Csv " + entry.getName() + " encontrado!");
					String linha;
					BufferedReader br = new BufferedReader(new InputStreamReader(str));
					List<String> bufSaida = new ArrayList<>();

					int contador = 0;
					System.out.println("Lendo Csv, pode demorar alguns segundos...");
					while ((linha = br.readLine()) != null) {
						
						if (contador < 0) {
							contador++;
						} else {
							bufSaida.add(linha + "\n");
						}
					}
					br.close();

///////////////////////CONTINUE
					/**
					 * TODO 
					 * 1- Extrair metodos
					 * 2- Gerar JASON
					 * 3- Arrumar POM
					 * 
					 */

				} else {
					System.out.println("aqui");
				continue;
				}

			}
			str.close();
			System.out.println("fim ");

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("ERRO DE EXECUÇÃO");
		}

	}
}
