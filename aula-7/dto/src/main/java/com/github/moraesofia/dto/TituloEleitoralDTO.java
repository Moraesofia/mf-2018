package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe TituloEleitoralDTO que contem os atributos relevantes para a
 * identificação do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class TituloEleitoralDTO {

    /**
     * Atributo correspondente à seção eleitoral.
     */
    private Integer secao;

    /**
     * Atributo correspondente à zona eleitoral.
     */
    private Integer zona;

    /**
     * Construtor sem parâmetros.
     */
    public TituloEleitoralDTO() {
    }

    /**
     * Construtor para a classe TituloEleitoralDTO.
     *
     * @param sec Seção.
     * @param zon Zona.
     */
    public TituloEleitoralDTO(final Integer sec, final Integer zon) {
        this.secao = sec;
        this.zona = zon;
    }

    /**
     * Retorna atributo 'secao'.
     *
     * @return the secao.
     */
    @XmlElement
    public final Integer getSecao() {
        return secao;
    }

    /**
     * Retorna atributo 'zona'.
     *
     * @return the zona.
     */
    @XmlElement
    public final Integer getZona() {
        return zona;
    }

}
