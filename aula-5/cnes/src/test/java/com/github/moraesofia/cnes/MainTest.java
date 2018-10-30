package com.github.moraesofia.cnes;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.zip.ZipInputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testes de Unidade para a classe Main.
 *
 * @author sofia
 *
 */
public class MainTest {

    @Test
    public void argumentoInvalido() {

        String[] args = new String[0];

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Main.main(args));

    }

    @Test
    public void argumentoValido() {

        String argumentos = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201809.ZIP;estabelecimentos.json";

        String[] args = argumentos.split(";");

        Assertions.assertDoesNotThrow(() -> Main.main(args));
    }

    @Test
    public void UrlInvalida() {

        String url = "naoEhUmSite";

        Assertions.assertThrows(IOException.class, () -> Main.conectURL(url));

    }

    @Test
    public void arquivoinvalido() {

        String conteudo = "";
        String arquivo = "src";

        Assertions.assertThrows(IOException.class,
                () -> Main.criarJsonExterno(conteudo, arquivo));

    }

    @Test
    public void inputNulo() {

        ZipInputStream input = null;

        Assertions.assertThrows(NullPointerException.class,
                () -> Main.leituraCsvCompactado(input));

    }

    @Test
    public void testGettersEstabelecimento() {
        String codigo = "12345";
        String razaoSocial = "local";
        String latitude = "1.00";
        String longitude = "1.00";
        Estabelecimento est = new Estabelecimento(codigo, razaoSocial, latitude,
                longitude);

        Assertions.assertTrue(codigo.equals(est.getCodigo()));
        Assertions.assertTrue(razaoSocial.equals(est.getRazaoSocial()));
        Assertions.assertTrue(latitude.equals(est.getLatitude()));
        Assertions.assertTrue(longitude.equals(est.getLongitude()));

    }

    // instanciar contrutor privado - Aumentar a Cobertura
    @Test
    public void construtorPrivado() throws Exception {

        Constructor<Main> construtor = Main.class.getDeclaredConstructor();

        Assertions.assertTrue(Modifier.isPrivate(construtor.getModifiers()));

        construtor.setAccessible(true);

        construtor.newInstance();

    }

}
