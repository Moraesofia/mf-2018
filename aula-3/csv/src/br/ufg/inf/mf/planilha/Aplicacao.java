package br.ufg.inf.mf.planilha;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	private static String[] siglas = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
			"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	private static int[] instituicoes = new int[27];

	public static void main(String[] args) throws Exception {
		String urlPlanilha;
		if (args.length == 1 && args[0].startsWith("http")) {
			urlPlanilha = args[0];
		} else if (args.length == 0) {
			urlPlanilha = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";
		} else {
			throw new IllegalArgumentException("ENTRADA INVALIDA");
		}

		URL url = new URL(urlPlanilha);

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		List<String> bufSaida = new ArrayList<>();
		String linha;
		int contador = 0;
		while ((linha = br.readLine()) != null) {
			if (contador < 11) {
				contador++;
			} else {
				bufSaida.add(linha + "\n");
			}
		}
		br.close();

		for (String row : bufSaida) {
			String[] teste = row.split(";");

			instituicoes = identificaEstado(teste[9], instituicoes);
		}

		ordenaVetores(instituicoes);

		System.out.println("Total de instituições de educação superior  por estado (ordem decrescente):");
		for (int i = 0; i < instituicoes.length - 1; i++) {
			System.out.println(siglas[i] + " : " + instituicoes[i]);
		}

	}

	/**
	 * Este metodo ordena os vetores contendo os estados e o numero de instituições
	 * de ensino superior que possuem em ordem decrescente.
	 * 
	 * @param instituicoes
	 */
	private static void ordenaVetores(int[] instituicoes) {
		// ordena vetor
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
	public static int[] identificaEstado(String sigla, int[] instituicoes) {

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
		return instituicoes;
	}

}
