package com.github.moraesofia.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe VinculoDTO que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class VinculoDTO {

    /**
     * Atributo correspondente ao código de identificação do relacionamento para
     * o Vínculo.
     */
    private Integer relacionamento;

    /**
     * Atributo correspondente a data de início do relacionamento para o
     * Vínculo.
     */
    private LocalDate dataInicio;

    /**
     * Atributo correspondente a data final do relacionamento para o Vínculo.
     */
    private LocalDate dataFim;

    /**
     * Construtor sem parâmetros.
     */
    public VinculoDTO() {
    }

    /**
     * Construtor para a classe VinculoDTO.
     *
     * @param rel Relacionamento.
     * @param di Data inicial.
     * @param df Data final.
     */
    public VinculoDTO(final Integer rel, final LocalDate di,
            final LocalDate df) {
        this.relacionamento = rel;
        this.dataInicio = di;
        this.dataFim = df;
    }

    /**
     * Retorna atributo 'relacionamento'.
     *
     * @return the relacionamento.
     */
    @XmlElement
    public final Integer getRelacionamento() {
        return relacionamento;
    }

    /**
     * Retorna atributo 'dataInicio'.
     *
     * @return the dataInicio.
     */
    @XmlElement
    public final LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * Retorna atributo 'dataFim'.
     *
     * @return the dataFim.
     */
    @XmlElement
    public final LocalDate getDataFim() {
        return dataFim;
    }

}
