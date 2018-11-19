package com.github.moraesofia.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe DadoDemograficoDTO que contem os atributos relevantes para a
 * identificação do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class DadoDemograficoDTO {

    /**
     * Atributo correspondente ao sexo.
     */
    private Integer sexo;

    /**
     * Atributo correspondente ao nome da mãe.
     */
    private String nomeMae;

    /**
     * Atributo correspondente ao nome do pai.
     */
    private String nomePai;

    /**
     * Atributo correspondente à situação familiar.
     */
    private Integer situacaoFamiliar;

    /**
     * Atributo correspondente à raça ou cor.
     */
    private Integer racaCor;

    /**
     * Atributo correspondente ao comentário.
     */
    private String comentario;

    /**
     * Atributo correspondente a fonte da notificação do óbito.
     */
    private Integer obitoFonte;

    /**
     * Atributo correspondente à pluralidade de nascimento.
     */
    private Integer nascPluralidade;

    /**
     * Atributo correspondente à ordem do nascimento.
     */
    private Integer nascOrdem;

    /**
     * Atributo correspondente ao surgimento do nascimento.
     */
    private String nascSurgimento;

    /**
     * Atributo correspondente à nacionalidade.
     */
    private NacionalidadeDTO nacionalidade;

    /**
     * Atributo correspondente à data de nascimento.
     */
    private DataDTO dataNascimento;

    /**
     * Atributo correspondente à data de óbito.
     */
    private DataDTO dataObito;

    /**
     * Construtor sem parâmetros.
     */
    public DadoDemograficoDTO() {
    }

    /**
     * Construtor para a classe DadoDemograficoDTO.
     *
     * @param sex Sexo.
     * @param nomMae Nome da Mãe.
     * @param nomPai Nome do Pai.
     * @param sitFam Situação Familiar.
     * @param raCor Raça\cor.
     * @param coment Comentário.
     * @param obitoFont fonte do óbito.
     * @param nascPlural Nascimento Pluralidade.
     * @param nascOrd Nascimento Ordem.
     * @param nascSurgi Nascimento Surgimento.
     * @param nacion Nacionalidade.
     * @param dataNasc Data de nascimento.
     * @param dataObit Data de óbito.
     */
    public DadoDemograficoDTO(final Integer sex, final String nomMae,
            final String nomPai, final Integer sitFam, final Integer raCor,
            final String coment, final Integer obitoFont,
            final Integer nascPlural, final Integer nascOrd,
            final String nascSurgi, final NacionalidadeDTO nacion,
            final DataDTO dataNasc, final DataDTO dataObit) {
        this.sexo = sex;
        this.nomeMae = nomMae;
        this.nomePai = nomPai;
        this.situacaoFamiliar = sitFam;
        this.racaCor = raCor;
        this.comentario = coment;
        this.obitoFonte = obitoFont;
        this.nascPluralidade = nascPlural;
        this.nascOrdem = nascOrd;
        this.nascSurgimento = nascSurgi;
        this.nacionalidade = nacion;
        this.dataNascimento = dataNasc;
        this.dataObito = dataObit;
    }

    /**
     * Retorna atributo 'sexo'.
     *
     * @return the sexo.
     */
    @XmlElement
    public final Integer getSexo() {
        return sexo;
    }

    /**
     * Retorna atributo 'nomeMae'.
     *
     * @return the nomeMae.
     */
    @XmlElement
    public final String getNomeMae() {
        return nomeMae;
    }

    /**
     * Retorna atributo 'nomePai'.
     *
     * @return the nomePai.
     */
    @XmlElement
    public final String getNomePai() {
        return nomePai;
    }

    /**
     * Retorna atributo 'situacaoFamiliar'.
     *
     * @return the situacaoFamiliar.
     */
    @XmlElement
    public final Integer getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    /**
     * Retorna atributo 'raca_cor'.
     *
     * @return the raca_cor.
     */
    @XmlElement
    public final Integer getRacaCor() {
        return racaCor;
    }

    /**
     * Retorna atributo 'comentario'.
     *
     * @return the comentario.
     */
    @XmlElement
    public final String getComentario() {
        return comentario;
    }

    /**
     * Retorna atributo 'obitoFonte'.
     *
     * @return the obitoFonte.
     */
    @XmlElement
    public final Integer getObitoFonte() {
        return obitoFonte;
    }

    /**
     * Retorna atributo 'nascPluralidade'.
     *
     * @return the nascPluralidade.
     */
    @XmlElement
    public final Integer getNascPluralidade() {
        return nascPluralidade;
    }

    /**
     * Retorna atributo 'nascOrdem'.
     *
     * @return the nascOrdem.
     */
    @XmlElement
    public final Integer getNascOrdem() {
        return nascOrdem;
    }

    /**
     * Retorna atributo 'nascSurgimento'.
     *
     * @return the nascSurgimento.
     */
    @XmlElement
    public final String getNascSurgimento() {
        return nascSurgimento;
    }

    /**
     * Retorna atributo 'nacionalidade'.
     *
     * @return the nacionalidade.
     */
    @XmlElement
    public final NacionalidadeDTO getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Retorna atributo 'dataNascimento'.
     *
     * @return the dataNascimento.
     */
    @XmlElement
    public final DataDTO getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Retorna atributo 'dataObito'.
     *
     * @return the dataObito.
     */
    @XmlElement
    public final DataDTO getDataObito() {
        return dataObito;
    }

}
