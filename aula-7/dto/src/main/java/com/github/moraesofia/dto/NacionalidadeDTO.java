package com.github.moraesofia.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe NacionalidadeDTO que contem os atributos relevantes para a
 * identificação do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class NacionalidadeDTO {

    /**
     * Atributo correspondente ao município de nascimento.
     */
    private Integer municipio;

    /**
     * Atributo correspondente ao entado de nascimento.
     */
    private String estado;

    /**
     * Atributo correspondente ao país de nascimento.
     */
    private Integer pais;

    /**
     * Atributo correspondente à data de entrada no Brasil.
     */
    private LocalDate dataEntradaPais;

    /**
     * Construtor sem parâmetros.
     */
    public NacionalidadeDTO() {
    }

    /**
     * Construtor para a classe NacionalidadeDTO.
     *
     * @param mun Municipio.
     * @param est Estado.
     * @param pa País.
     * @param dataEnPa Data de entrana no país.
     */
    public NacionalidadeDTO(final Integer mun, final String est,
            final Integer pa, final LocalDate dataEnPa) {
        this.municipio = mun;
        this.estado = est;
        this.pais = pa;
        this.dataEntradaPais = dataEnPa;
    }

    /**
     * Retorna atributo 'municipio'.
     *
     * @return the municipio.
     */
    @XmlElement
    public final Integer getMunicipio() {
        return municipio;
    }

    /**
     * Retorna atributo 'estado'.
     *
     * @return the estado.
     */
    @XmlElement
    public final String getEstado() {
        return estado;
    }

    /**
     * Retorna atributo 'pais'.
     *
     * @return the pais.
     */
    @XmlElement
    public final Integer getPais() {
        return pais;
    }

    /**
     * Retorna atributo 'dataEntradaPais'.
     *
     * @return the dataEntradaPais.
     */
    @XmlElement
    public final LocalDate getDataEntradaPais() {
        return dataEntradaPais;
    }

}
