package com.github.moraesofia.listdiretorio;

import java.io.File;

public class DiretorioListarDirs {

	public static void main(String[] args) {
		
		File[] directories = new File(System.getProperty("user.dir")).listFiles(File::isDirectory);

		for (File file : directories) {
			extractDirs(file);
		}

	}

	/**
	 * Este metodo exibe o caminho completo de todos os diretórios e subdiretórios
	 * acessíveis a partir do diretório corrente.
	 * 
	 * @param directories
	 */
	private static void extractDirs(File file) {

		if (file.isDirectory()) {
			System.out.println(file.toString());
		}

		if (file != null) {
			File[] subDirectories = new File(file.toString()).listFiles(File::isDirectory);
			for (File file2 : subDirectories) {
				extractDirs(file2);
			}

		}

	}

}
