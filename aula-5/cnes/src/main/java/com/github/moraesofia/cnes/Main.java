package com.github.moraesofia.cnes;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void lePlanilhaUrl(String urlPlanilha, List<String> bufSaida)
			throws MalformedURLException, IOException {
		try {
			URL url = new URL(urlPlanilha);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String linha;
			int contador = 0;
			while ((linha = br.readLine()) != null) {
				if (contador < 0) {
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
	
}
