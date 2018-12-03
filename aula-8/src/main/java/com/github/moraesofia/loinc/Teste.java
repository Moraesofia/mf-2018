package com.github.moraesofia.loinc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Teste {

    public static void main(String[] args)
            throws MalformedURLException, IOException {

        HttpURLConnection connection = (HttpURLConnection) new URL(
                "https://www.db4free.net/phpMyAdmin/index.php")
                        .openConnection();
        connection.setRequestMethod("HEAD");
        int responseCode = connection.getResponseCode();

        if (responseCode != 200) {
            // SQL server not available!
            System.out.println("fora do ar");
        } else {
            System.out.println("funcionando");
        }

        // Conexao.getConnection();
        // System.out.println("Conexao.status");
    }

}
