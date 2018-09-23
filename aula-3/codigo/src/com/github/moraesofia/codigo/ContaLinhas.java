package src.com.github.moraesofia.codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Código que, quando executado, se se trata de um único argumento, este deve
 * ser interpretado como o sufixo de todos os arquivos, contidos no diretório
 * corrente ou subdiretórios do corrente, cuja quantidade de linhas devem ser
 * contadas. Se forem fornecidos dois argumentos, então o primeiro deles deve
 * ser interpretado como o diretório a partir do qual arquivos com o sufixo
 * fornecido no segundo argumento serão procurados e, cada um encontrado, terá o
 * total de linhas correspondente acumulado.
 * <p>
 * Em ambos os casos deverá ser fornecida uma linha para cada arquivo
 * encontrado, na qual consta, primeiro, o total de linha do arquivo, seguido de
 * espaço seguido do caminho completo do nome do arquivo. Além de uma linha para
 * cada arquivo deverá ser fornecida uma linha adicional, ao final da lista dos
 * arquivos, indicando o total acumulado de linhas.
 * 
 * @author sofia
 *
 */
public class ContaLinhas {

	/**
	 * Diretorio para execução do programa.
	 */
	private static String diretorio;

	/**
	 * sufixo indicando o tipo de arquivo a ser procurado.
	 */
	private static String sufixo;

	/**
	 * Total de linhas em todos os arquivos do tipo indicado pelo sufixo no
	 * diretório indicado e seus subdiretórios.
	 */
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
				try (Stream<String> stream = Files.lines(Paths.get(file.toString()))) {
					totalLinhas += stream.count();
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
