package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe LinhaEnderecoDTO que contem os atributos relevantes para a
 * identificação do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class LinhaEnderecoDTO {

    /**
     * Atributo correspondente à ordem da linha de endereço.
     */
    private Integer ordem;

    /**
     * Atributo correspondente à linha de endereço.
     */
    private String linha;

    /**
     * Construtor sem parâmetros.
     */
    public LinhaEnderecoDTO() {
    }

    /**
     * Construtor para a classe LinhaEnderecoDTO.
     *
     * @param ord Ordem.
     * @param lin Linha.
     */
    public LinhaEnderecoDTO(final Integer ord, final String lin) {
        super();
        this.ordem = ord;
        this.linha = lin;
    }

    /**
     * Retorna atributo 'ordem'.
     *
     * @return the ordem.
     */
    @XmlElement
    public final Integer getOrdem() {
        return ordem;
    }

    /**
     * Retorna atributo 'linha'.
     *
     * @return the linha.
     */
    @XmlElement
    public final String getLinha() {
        return linha;
    }

}
