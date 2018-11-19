package com.github.moraesofia.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe UtilizacaoDTO que contem os atributos relevantes para a identificação
 * do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class UtilizacaoDTO {

    /**
     * Atributo correspondente ao uso.
     */
    private Integer uso;

    /**
     * Atributo correspondente a Data de Inicio do uso.
     */
    private LocalDate dataIncio;

    /**
     * Atributo correspondente a Data de Fim do uso.
     */
    private LocalDate dataFim;

    /**
     * Construtor sem parâmetros.
     */
    public UtilizacaoDTO() {
    }

    /**
     *
     * Construtor para a classe UtilizacaoDTO.
     *
     * @param u Uso.
     * @param di Data Inicio.
     * @param df Data Final.
     */
    public UtilizacaoDTO(final Integer u, final LocalDate di,
            final LocalDate df) {
        super();
        this.uso = u;
        this.dataIncio = di;
        this.dataFim = df;
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

    /**
     * Retorna atributo 'dataIncio'.
     *
     * @return the dataIncio.
     */
    @XmlElement
    public final LocalDate getDataIncio() {
        return dataIncio;
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
