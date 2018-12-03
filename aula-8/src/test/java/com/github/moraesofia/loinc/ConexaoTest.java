package com.github.moraesofia.loinc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testes unitários para a classe "Conexao.java".
 *
 * @author sofia.
 *
 */
public class ConexaoTest {

    @Test
    public void testeConexaoSGBD() throws MalformedURLException, IOException {

        HttpURLConnection connection = (HttpURLConnection) new URL(
                "https://www.db4free.net/phpMyAdmin/index.php")
                        .openConnection();
        connection.setRequestMethod("HEAD");
        int responseCode = connection.getResponseCode();

        if (responseCode != 200) {
            // SGBD server not available!
            Assertions.assertNotEquals(responseCode, 200);
        } else {
            // SGBD server available - it should connect!
            String expectedStatus = "Connection established";
            Conexao.getConnection();

            Assertions.assertEquals(Conexao.status, expectedStatus);
        }

    }
}
