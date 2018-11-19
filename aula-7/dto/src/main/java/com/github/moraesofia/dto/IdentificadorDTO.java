package com.github.moraesofia.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe IdentificadorDTO que contem os atributos relevantes para a
 * identificação do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class IdentificadorDTO {

    /**
     * Atributo correspondente a designação do identificador para o paciente.
     */
    private String designacao;

    /**
     * Atributo correspondente a área do identificador para o paciente.
     */
    private Integer area;

    /**
     * Atributo correspondente ao emissor do identificador para o paciente.
     */
    private String emissor;

    /**
     * Atributo correspondente a data do identificador para o paciente.
     */
    private LocalDate data;

    /**
     * Atributo correspondente ao tipo do identificador para o paciente.
     */
    private String tipo;

    /**
     * Atributo correspondente a utilização do identificador para o paciente.
     */
    private UtilizacaoDTO utilizacao;

    /**
     * Atributo correspondente a certidão do identificador para o paciente.
     */
    private CertidaoDTO cetidao;

    /**
     * Atributo correspondente a CTPS do identificador para o paciente.
     */
    private CtpsDTO ctps;

    /**
     * Atributo correspondente ao vínculo do identificador para o paciente.
     */
    private VinculoDTO vinculo;

    /**
     * Construtor sem parâmetros.
     */
    public IdentificadorDTO() {

    }

    /**
     * Construtor para a classe IdentificadorDTO.
     *
     * @param desig Designaçao.
     * @param ar Área.
     * @param emis Emissor.
     * @param dat Data.
     * @param tip Tipo
     * @param util Utilização.
     * @param ceti Certidão.
     * @param ct CTPS.
     * @param vin Vínculo.
     */
    public IdentificadorDTO(final String desig, final Integer ar,
            final String emis, final LocalDate dat, final String tip,
            final UtilizacaoDTO util, final CertidaoDTO ceti, final CtpsDTO ct,
            final VinculoDTO vin) {
        this.designacao = desig;
        this.area = ar;
        this.emissor = emis;
        this.data = dat;
        this.tipo = tip;
        this.utilizacao = util;
        this.cetidao = ceti;
        this.ctps = ct;
        this.vinculo = vin;
    }

    /**
     * Retorna atributo 'designacao'.
     *
     * @return the designacao.
     */
    @XmlElement
    public final String getDesignacao() {
        return designacao;
    }

    /**
     * Retorna atributo 'area'.
     *
     * @return the area.
     */
    @XmlElement
    public final Integer getArea() {
        return area;
    }

    /**
     * Retorna atributo 'emissor'.
     *
     * @return the emissor.
     */
    @XmlElement
    public final String getEmissor() {
        return emissor;
    }

    /**
     * Retorna atributo 'data'.
     *
     * @return the data.
     */
    @XmlElement
    public final LocalDate getData() {
        return data;
    }

    /**
     * Retorna atributo 'tipo'.
     *
     * @return the tipo.
     */
    @XmlElement
    public final String getTipo() {
        return tipo;
    }

    /**
     * Retorna atributo 'utilizacao'.
     *
     * @return the utilizacao.
     */
    @XmlElement
    public final UtilizacaoDTO getUtilizacao() {
        return utilizacao;
    }

    /**
     * Retorna atributo 'cetidao'.
     *
     * @return the cetidao.
     */
    @XmlElement
    public final CertidaoDTO getCetidao() {
        return cetidao;
    }

    /**
     * Retorna atributo 'ctps'.
     *
     * @return the ctps.
     */
    @XmlElement
    public final CtpsDTO getCtps() {
        return ctps;
    }

    /**
     * Retorna atributo 'vinculo'.
     *
     * @return the vinculo.
     */
    @XmlElement
    public final VinculoDTO getVinculo() {
        return vinculo;
    }

}
