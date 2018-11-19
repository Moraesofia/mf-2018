package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe CertidaoDTO que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class CertidaoDTO {

    /**
     * Atributo correspondente ao tipo da certidão.
     */
    private Integer tipo;

    /**
     * Atributo correspondente ao cartorio da certidão.
     */
    private String cartorio;

    /**
     * Atributo correspondente ao livro da certidão.
     */
    private Integer livro;

    /**
     * Atributo correspondente a folha da certidão.
     */
    private Integer folha;

    /**
     * Atributo correspondente ao termo da certidão.
     */
    private Integer termo;

    /**
     * Construtor sem parametros.
     */
    public CertidaoDTO() {
    }

    /**
     * Construtor para a classe CertidaoDTO.
     *
     * @param tip Tipo.
     * @param car Cartório
     * @param liv Livro.
     * @param fol Folha.
     * @param ter Termo.
     */
    public CertidaoDTO(final Integer tip, final String car, final Integer liv,
            final Integer fol, final Integer ter) {
        super();
        this.tipo = tip;
        this.cartorio = car;
        this.livro = liv;
        this.folha = fol;
        this.termo = ter;
    }

    /**
     * Retorna atributo 'tipo'.
     *
     * @return the tipo.
     */
    @XmlElement
    public final Integer getTipo() {
        return tipo;
    }

    /**
     * Retorna atributo 'cartorio'.
     *
     * @return the cartorio.
     */
    @XmlElement
    public final String getCartorio() {
        return cartorio;
    }

    /**
     * Retorna atributo 'livro'.
     *
     * @return the livro.
     */
    @XmlElement
    public final Integer getLivro() {
        return livro;
    }

    /**
     * Retorna atributo 'folha'.
     *
     * @return the folha.
     */
    @XmlElement
    public final Integer getFolha() {
        return folha;
    }

    /**
     * Retorna atributo 'termo'.
     *
     * @return the termo.
     */
    @XmlElement
    public final Integer getTermo() {
        return termo;
    }

}
