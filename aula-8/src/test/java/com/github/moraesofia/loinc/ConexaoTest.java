package com.github.moraesofia.loinc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Testes unitários para a classe "Conexao.java".
 *
 * @author sofia.
 *
 */
public class ConexaoTest {

    @BeforeAll
    public void criaRegistros() {
        Connection c = Conexao.getConnection();
        PreparedStatement s;
        try {
            s = c.prepareStatement(
                    "INSERT INTO `MapTo` (`loinc`,`map_to`) VALUES (?,?)");
            s.setObject(1, "1276-5", Types.VARCHAR);
            s.setObject(2, "14994-8", Types.VARCHAR);
            s.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = c.prepareStatement(
                    "INSERT INTO `SourceOrganization` (`copyright_id`,`name`,`copyright`,`terms_of_use`,`url`) VALUES (?,?,?,?,?)");
            s.setObject(1, "Pfizer", Types.VARCHAR);
            s.setObject(2, "Pfizer, Inc", Types.VARCHAR);
            s.setObject(3, "Pfizer Inc. All rights reserved.", Types.VARCHAR);
            s.setObject(4,
                    "No permission required to reproduce, translate, display or distribute.",
                    Types.VARCHAR);
            s.setObject(5, "http://www.phqscreeners.com/terms.aspx",
                    Types.VARCHAR);
            s.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s = c.prepareStatement(
                    "INSERT INTO `Loinc` (`loinc_num`,`component`,`property`) VALUES (?,?,?)");
            s.setObject(1, "10000-8", Types.VARCHAR);
            s.setObject(2, "R wave duration.lead AVR", Types.VARCHAR);
            s.setObject(3, "Time", Types.VARCHAR);
            s.executeUpdate();

            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @AfterAll
    public void deletaRegistros() {
        Connection c = Conexao.getConnection();
        PreparedStatement s = null;
        try {
            s = c.prepareStatement("TRUNCATE `MapTo`");
            s.executeUpdate();

            s = c.prepareStatement("DELETE FROM `MapTo`");
            s.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            s = c.prepareStatement("TRUNCATE `SourceOrganization`");
            s.executeUpdate();

            s = c.prepareStatement("DELETE FROM `SourceOrganization`");
            s.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            s = c.prepareStatement("TRUNCATE `Loinc`");
            s.executeUpdate();

            s = c.prepareStatement("DELETE FROM `Loinc`");
            s.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testeDisponibilidadeServidor()
            throws MalformedURLException, IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(
                "https://www.db4free.net/phpMyAdmin/index.php")
                        .openConnection();
        connection.setRequestMethod("HEAD");
        int responseCode = connection.getResponseCode();

        Assertions.assertNotEquals(responseCode, 200);

    }

    @Test
    public void testeConexaoSGBD() {

        String expectedStatus = "Connection established";
        Conexao.getConnection();

        Assertions.assertEquals(Conexao.status, expectedStatus);

    }

    @Test
    public void testeSelectTabelaMapTo() throws SQLException {
        Connection c = Conexao.getConnection();
        String loincValue = "1276-5";
        String mapToValue = "10000-8";
        PreparedStatement s = c.prepareStatement(
                "SELECT `map_to` FROM `MapTo` WHERE `loinc`=?");
        s.setObject(1, loincValue, Types.VARCHAR);
        final ResultSet rs = s.executeQuery();

        if (rs.next()) {
            String result = rs.getString("map_to");
            Assertions.assertEquals(mapToValue, result);
        }

        try {
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testeSelectTabelaSourceOrganization() throws SQLException {
        Connection c = Conexao.getConnection();
        String nameValue = "Pfizer, Inc";
        String copyIdValue = "Pfizer";
        PreparedStatement s = c.prepareStatement(
                "SELECT `copyright_id` FROM `SourceOrganization` WHERE `name`=?");
        s.setObject(1, nameValue, Types.VARCHAR);
        final ResultSet rs = s.executeQuery();

        if (rs.next()) {
            String result = rs.getString("copyright_id");
            Assertions.assertEquals(copyIdValue, result);
        }

        try {
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testeSelectTabelaLoinc() throws SQLException {
        Connection c = Conexao.getConnection();
        String loincNumValue = "10000-8";
        String propertyValue = "Time";
        PreparedStatement s = c.prepareStatement(
                "SELECT `property` FROM `Loinc` WHERE `loinc_num`=?");
        s.setObject(1, loincNumValue, Types.VARCHAR);
        final ResultSet rs = s.executeQuery();

        if (rs.next()) {
            String result = rs.getString("map_to");
            Assertions.assertEquals(propertyValue, result);
        }

        try {
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
