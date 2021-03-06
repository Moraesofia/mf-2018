package com.github.moraesofia.listarquivos;

import java.io.File;

/**
 * Código que, quando executado, exibe o caminho completo dos arquivos.
 * 
 * @author sofia
 *
 */
public class DiretorioListarArquivos {

	public static void main(String[] args) {

		File[] directories = new File(System.getProperty("user.dir")).listFiles(File::exists);

		for (File file : directories) {
			extractDirsFindFiles(file);
		}

	}

	/**
	 * Este metodo exibe arquivos e extrai subdiretórios recursivamente a partir do
	 * diretório corrente.
	 * 
	 * @param directories
	 */
	private static void extractDirsFindFiles(File file) {

		if (file.isFile()) {
			System.out.println(file.toString());
		}

		if (file != null && file.isDirectory()) {
			File[] subDirectories = new File(file.toString()).listFiles(File::exists);
			for (File file2 : subDirectories) {
				extractDirsFindFiles(file2);
			}

		}

	}
}
