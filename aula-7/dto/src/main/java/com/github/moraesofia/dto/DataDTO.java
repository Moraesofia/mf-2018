package com.github.moraesofia.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe DataDTO que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class DataDTO {

    /**
     * Atributo correspondente à data.
     */
    private LocalDate data;

    /**
     * Atributo correspondente à acurácia da data.
     */
    private String acuracia;

    /**
     *
     * Construtor sem parâmetros.
     */
    public DataDTO() {

    }

    /**
     * Construtor para a classe DataDTO.
     *
     * @param dat Data.
     * @param acu Acurácia.
     */
    public DataDTO(final LocalDate dat, final String acu) {
        this.data = dat;
        this.acuracia = acu;
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
     * Retorna atributo 'acuracia'.
     *
     * @return the acuracia.
     */
    @XmlElement
    public final String getAcuracia() {
        return acuracia;
    }

}
