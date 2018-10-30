package com.github.moraesofia.cnes;

/**
 * Classe Estabelecimento que contem os atributos relevantes para a execução do
 * programa.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
public class Estabelecimento {

    /**
     * Atributo que indica o código do estabelecimento, de acordo com o Cadastro
     * Nacional de Estabelecimentos de Saúde.
     */
    private final String codigo;

    /**
     * Atributo que indica a razão social do estabelecimento.
     */
    private final String razaoSocial;

    /**
     * Atributo que indica a latitude do estabelecimento, para identificar sua
     * posição geográfica.
     */
    private final String latitude;

    /**
     * Atributo que indica a longitude do estabelecimento, para identificar sua
     * posição geográfica.
     */
    private final String longitude;

    /**
     * Construtor para a classe 'Estabelecimento' - Cria um objeto do tipo
     * Estabelecimento.
     *
     * @param cod Código.
     * @param rs Razão Social.
     * @param lat Latitude.
     * @param lon Longitude.
     */
    public Estabelecimento(final String cod, final String rs, final String lat,
            final String lon) {
        super();
        this.codigo = cod;
        this.razaoSocial = rs;
        this.latitude = lat;
        this.longitude = lon;
    }

    /**
     * Retorna atributo 'codigo'.
     *
     * @return codigo do estabelecimento.
     */
    public final String getCodigo() {
        return codigo;
    }

    /**
     * Retorna atributo 'razaoSocial'.
     *
     * @return razaoSocial do estabelecimento
     */
    public final String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Retorna atributo 'latitude'.
     *
     * @return latitude do estabelecimento.
     */
    public final String getLatitude() {
        return latitude;
    }

    /**
     * Retorna atributo 'longitude'.
     *
     * @return longitude do estabelecimento.
     */
    public final String getLongitude() {
        return longitude;
    }

}
