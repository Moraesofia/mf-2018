package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe ComunicacaoDTO que contem os atributos relevantes para a identificação
 * do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class ComunicacaoDTO {

    /**
     * Atributo correspondente ao meio de comunicação.
     */
    private Integer meio;

    /**
     * Atributo correspondente a preferencia de horário para comunicação.
     */
    private String preferencia;

    /**
     * Atributo correspondente ao detalhe da comunicação.
     */
    private String detalhe;

    /**
     * Atributo correspondente ao uso da comunicação.
     */
    private Integer uso;

    /**
     *
     * Construtor para sem parâmetros.
     */
    public ComunicacaoDTO() {
    }

    /**
     *
     * Construtor para a classe ComunicacaoDTO.
     *
     * @param m Meio.
     * @param p Preferencia.
     * @param d Detalhe.
     * @param u Utilização.
     */
    public ComunicacaoDTO(final Integer m, final String p, final String d,
            final Integer u) {
        this.meio = m;
        this.preferencia = p;
        this.detalhe = d;
        this.uso = u;
    }

    /**
     * Retorna atributo 'meio'.
     *
     * @return the meio.
     */
    @XmlElement
    public final Integer getMeio() {
        return meio;
    }

    /**
     * Retorna atributo 'preferencia'.
     *
     * @return the preferencia.
     */
    @XmlElement
    public final String getPreferencia() {
        return preferencia;
    }

    /**
     * Retorna atributo 'detalhe'.
     *
     * @return the detalhe.
     */
    @XmlElement
    public final String getDetalhe() {
        return detalhe;
    }

    /**
     * Retorna atributo 'uso'.
     *
     * @return the uso.
     */
    @XmlElement
    public final Integer getUso() {
        return uso;
    }

}
