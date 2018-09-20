package com.github.moraesofia.contaLinhas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ContaLinhas {

	private static String diretorio;
	private static String sufixo;
	private static int totalLinhas = 0;

	public static void main(String[] args) {

		if (args.length == 1) {
			sufixo = args[0];
			diretorio = System.getProperty("user.dir");
			findDirectories();
		} else if (args.length == 2) {
			diretorio = args[0];
			sufixo = args[1];
			findDirectories();
		} else {
			throw new IllegalArgumentException("ENTRADA INVALIDA");
		}
		findDirectories();
	}

	/**
	 * Este metodo procura e lista os arquivos e diretórios acessíveis a partir de
	 * um diretório indicado pelo parâmetro.
	 * <p>
	 * Também invoca o método extractDirsFindFiles.
	 * 
	 * @param sufix
	 * @param dir
	 */
	private static void findDirectories() {
		File[] directories = new File(diretorio).listFiles(File::exists);

		for (File file : directories) {
			extractDirsFindFiles(file);
		}
		System.out.println("Total de linhas: " + totalLinhas);
	}

	/**
	 * Este metodo exibe arquivos e extrai subdiretórios recursivamente a partir do
	 * diretório corrente.
	 * 
	 * @param directories
	 */
	private static void extractDirsFindFiles(File file) {

		if (file.isFile()) {
			if (file.toString().endsWith(sufixo)) {
				System.out.println(file.toString());
				try (Stream<String> stream = Files.lines(Paths.get(file.toString()))){
					totalLinhas+=stream.count();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}

		if (file != null && file.isDirectory()) {
			File[] subDirectories = new File(file.toString()).listFiles(File::exists);
			for (File file2 : subDirectories) {
				extractDirsFindFiles(file2);
			}

		}

	}

}
