package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe RepresentacaoDTO que contem os atributos relevantes para a
 * identificação do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class RepresentacaoDTO {

    /**
     * Atributo correspondente à utilização.
     */
    private String utilizacao;

    /**
     * Atributo correspondente à utilização alternativa.
     */
    private String alternativa;

    /**
     * Construtor sem parâmetros.
     */
    public RepresentacaoDTO() {
    }

    /**
     * Construtor para a classe RepresentacaoDTO.
     *
     * @param util Utilização.
     * @param alter Alternativa.
     */
    public RepresentacaoDTO(final String util, final String alter) {
        super();
        this.utilizacao = util;
        this.alternativa = alter;
    }

    /**
     * Retorna atributo 'utilizacao'.
     *
     * @return the utilizacao.
     */
    @XmlElement
    public final String getUtilizacao() {
        return utilizacao;
    }

    /**
     * Retorna atributo 'alternativa'.
     *
     * @return the alternativa.
     */
    @XmlElement
    public final String getAlternativa() {
        return alternativa;
    }

}
