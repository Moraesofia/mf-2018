package com.github.moraesofia.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe NomeDTO que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class NomeDTO {

    /**
     * Atributo correspondente à titulação.
     */
    private String titulos;

    /**
     * Atributo correspondente aos nomes.
     */
    private String nomes;

    /**
     * Atributo correspondente aos sobrenomes.
     */
    private String sobrenomes;

    /**
     * Atributo correspondente aos sufixos.
     */
    private String sufixos;

    /**
     * Atributo correspondente a preferencia.
     */
    private Integer preferido;

    /**
     * Atributo correspondente ao uso condicional.
     */
    private Integer usoCondicional;

    /**
     * Atributo correspondente as utilizações.
     */
    private List<UtilizacaoDTO> utilizacao;

    /**
     * Atributo correspondente as representações.
     */
    private List<RepresentacaoDTO> representacao;

    /**
     * Construtor sem parâmetros.
     */
    public NomeDTO() {
    }

    /**
     * Construtor para a classe NomeDTO.
     *
     * @param tit Títulos.
     * @param nom Nomes.
     * @param snom Sobrenomes.
     * @param suf Sufixos.
     * @param pref Preferido.
     * @param uso Uso condicional.
     * @param util Utilizações.
     * @param rep Representações.
     */
    public NomeDTO(final String tit, final String nom, final String snom,
            final String suf, final Integer pref, final Integer uso,
            final List<UtilizacaoDTO> util, final List<RepresentacaoDTO> rep) {
        super();
        this.titulos = tit;
        this.nomes = nom;
        this.sobrenomes = snom;
        this.sufixos = suf;
        this.preferido = pref;
        this.usoCondicional = uso;
        this.utilizacao = util;
        this.representacao = rep;
    }

    /**
     * Retorna atributo 'titulos'.
     *
     * @return the titulos.
     */
    @XmlElement
    public final String getTitulos() {
        return titulos;
    }

    /**
     * Retorna atributo 'nomes'.
     *
     * @return the nomes.
     */
    @XmlElement
    public final String getNomes() {
        return nomes;
    }

    /**
     * Retorna atributo 'sobrenomes'.
     *
     * @return the sobrenomes.
     */
    @XmlElement
    public final String getSobrenomes() {
        return sobrenomes;
    }

    /**
     * Retorna atributo 'sufixos'.
     *
     * @return the sufixos.
     */
    @XmlElement
    public final String getSufixos() {
        return sufixos;
    }

    /**
     * Retorna atributo 'preferido'.
     *
     * @return the preferido.
     */
    @XmlElement
    public final Integer getPreferido() {
        return preferido;
    }

    /**
     * Retorna atributo 'usoCondicional'.
     *
     * @return the usoCondicional.
     */
    @XmlElement
    public final Integer getUsoCondicional() {
        return usoCondicional;
    }

    /**
     * Retorna atributo 'utilizacao'.
     *
     * @return the utilizacao.
     */
    @XmlElement
    public final List<UtilizacaoDTO> getUtilizacao() {
        return utilizacao;
    }

    /**
     * Retorna atributo 'representacao'.
     *
     * @return the representacao.
     */
    @XmlElement
    public final List<RepresentacaoDTO> getRepresentacao() {
        return representacao;
    }

}
