package com.github.moraesofia.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe EnderecoDTO que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class EnderecoDTO {

    /**
     * Atributo correspondente ao bairro do endereço.
     */
    private String bairro;

    /**
     * Atributo correspondente ao distrito do endereço.
     */
    private String distrito;

    /**
     * Atributo correspondente ao código do município do endereço.
     */
    private Integer codMunicipuo;

    /**
     * Atributo correspondente ao estado do endereço.
     */
    private String estado;

    /**
     * Atributo correspondente ao CEP do endereço.
     */
    private String cep;

    /**
     * Atributo correspondente à caixa postal do endereço.
     */
    private String caixaPostal;

    /**
     * Atributo correspondente ao país do endereço.
     */
    private Integer pais;

    /**
     * Atributo correspondente ao tipo do endereço.
     */
    private Integer tipo;

    /**
     * Atributo correspondente as linhas de endereço do endereço.
     */
    private List<LinhaEnderecoDTO> linEndereco;

    /**
     * Atributo correspondente à data inicial do endereço.
     */
    private DataDTO dataInicio;

    /**
     * Atributo correspondente à data final do endereço.
     */
    private DataDTO dataFim;

    /**
     *
     * Construtor sem parâmetros.
     */
    public EnderecoDTO() {
    }

    /**
     * Construtor para a classe EnderecoDTO.
     *
     * @param bai Bairro.
     * @param dist Distrito.
     * @param codMun Código Municipio.
     * @param est Estado.
     * @param cEp CEP.
     * @param caiPost Caixa postal.
     * @param pa País
     * @param tip Tipo.
     * @param linEnd Linhas de Endereço.
     * @param di Data inicial.
     * @param df Data final.
     */
    public EnderecoDTO(final String bai, final String dist,
            final Integer codMun, final String est, final String cEp,
            final String caiPost, final Integer pa, final Integer tip,
            final List<LinhaEnderecoDTO> linEnd, final DataDTO di,
            final DataDTO df) {
        this.bairro = bai;
        this.distrito = dist;
        this.codMunicipuo = codMun;
        this.estado = est;
        this.cep = cEp;
        this.caixaPostal = caiPost;
        this.pais = pa;
        this.tipo = tip;
        this.linEndereco = linEnd;
        this.dataInicio = di;
        this.dataFim = df;
    }

    /**
     * Retorna atributo 'bairro'.
     *
     * @return the bairro.
     */
    @XmlElement
    public final String getBairro() {
        return bairro;
    }

    /**
     * Retorna atributo 'distrito'.
     *
     * @return the distrito.
     */
    @XmlElement
    public final String getDistrito() {
        return distrito;
    }

    /**
     * Retorna atributo 'codMunicipuo'.
     *
     * @return the codMunicipuo.
     */
    @XmlElement
    public final Integer getCodMunicipuo() {
        return codMunicipuo;
    }

    /**
     * Retorna atributo 'estado'.
     *
     * @return the estado.
     */
    @XmlElement
    public final String getEstado() {
        return estado;
    }

    /**
     * Retorna atributo 'cep'.
     *
     * @return the cep.
     */
    @XmlElement
    public final String getCep() {
        return cep;
    }

    /**
     * Retorna atributo 'caixaPostal'.
     *
     * @return the caixaPostal.
     */
    @XmlElement
    public final String getCaixaPostal() {
        return caixaPostal;
    }

    /**
     * Retorna atributo 'pais'.
     *
     * @return the pais.
     */
    @XmlElement
    public final Integer getPais() {
        return pais;
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
     * Retorna atributo 'linEndereco'.
     *
     * @return the linEndereco.
     */
    @XmlElement
    public final List<LinhaEnderecoDTO> getLinEndereco() {
        return linEndereco;
    }

    /**
     * Retorna atributo 'dataInicio'.
     *
     * @return the dataInicio.
     */
    @XmlElement
    public final DataDTO getDataInicio() {
        return dataInicio;
    }

    /**
     * Retorna atributo 'dataFim'.
     *
     * @return the dataFim.
     */
    @XmlElement
    public final DataDTO getDataFim() {
        return dataFim;
    }

}
