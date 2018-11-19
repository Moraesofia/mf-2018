package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe CtpsDTO que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class CtpsDTO {

    /**
     * Atributo correspondente à série da Carteira de Trabalho e Previdência
     * Social.
     */
    private Integer serie;

    /**
     * Atributo correspondente ao estado da Carteira de Trabalho e Previdência
     * Social.
     */
    private String estado;

    /**
     * Construtor sem parâmetros.
     */
    public CtpsDTO() {

    }

    /**
     * Construtor para a classe CtpsDTO.
     *
     * @param ser Série.
     * @param est Estado.
     */
    public CtpsDTO(final Integer ser, final String est) {
        this.serie = ser;
        this.estado = est;
    }

    /**
     * Retorna atributo 'serie'.
     *
     * @return the serie.
     */
    @XmlElement
    public final Integer getSerie() {
        return serie;
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

}
