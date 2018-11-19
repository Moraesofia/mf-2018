package com.github.moraesofia.dto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Classe IndividuoDTO que contem os atributos relevantes para a execução do
 * programa e os metodos para criacao/leitura de arquivos JSON e XML (presentes
 * no final do arquivo).
 * <p>
 * Para mais informações, consulte o "package.info".
 *
 * @author sofia
 *
 */
@XmlRootElement
public class IndividuoDTO {

    /**
     * Atributo correspondente à lista de identificadoes para o índivíduo.
     */
    private List<IdentificadorDTO> identificadores;

    /**
     * Atributo correspondente à lista de vínculos para o índivíduo.
     */
    private List<VinculoDTO> vinculos;

    /**
     * Atributo correspondente à lista de nomes para o índivíduo.
     */
    private List<NomeDTO> nomes;

    /**
     * Atributo correspondente à lista de endereços para o índivíduo.
     */
    private List<EnderecoDTO> enderecos;

    /**
     * Atributo correspondente à lista de comunicações para o índivíduo.
     */
    private List<ComunicacaoDTO> comunicacoes;

    /**
     * Atributo correspondente aos dados demograficos do índivíduo.
     */
    private DadoDemograficoDTO dadoDemografico;

    /**
     * Construtor sem parâmetros.
     */
    public IndividuoDTO() {
    }

    /**
     * Construtor para a classe IndividuoDTO.
     *
     * @param ident Lista de Identificadores.
     * @param vinc Lista de Vínculos.
     * @param nom Lista de Nomes.
     * @param end Lista de Endereços.
     * @param comunic Lista de Comunicações.
     * @param dadoDemo dados Demográficos.
     */
    public IndividuoDTO(final List<IdentificadorDTO> ident,
            final List<VinculoDTO> vinc, final List<NomeDTO> nom,
            final List<EnderecoDTO> end, final List<ComunicacaoDTO> comunic,
            final DadoDemograficoDTO dadoDemo) {
        this.identificadores = ident;
        this.vinculos = vinc;
        this.nomes = nom;
        this.enderecos = end;
        this.comunicacoes = comunic;
        this.dadoDemografico = dadoDemo;
    }

    /**
     * Retorna atributo 'identificadores'.
     *
     * @return the identificadores.
     */
    @XmlElement
    public final List<IdentificadorDTO> getIdentificadores() {
        return identificadores;
    }

    /**
     * Retorna atributo 'vinculos'.
     *
     * @return the vinculos.
     */
    @XmlElement
    public final List<VinculoDTO> getVinculos() {
        return vinculos;
    }

    /**
     * Retorna atributo 'nomes'.
     *
     * @return the nomes.
     */
    @XmlElement
    public final List<NomeDTO> getNomes() {
        return nomes;
    }

    /**
     * Retorna atributo 'enderecos'.
     *
     * @return the enderecos.
     */
    @XmlElement
    public final List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    /**
     * Retorna atributo 'cominucacoes'.
     *
     * @return the cominucacoes.
     */
    @XmlElement
    public final List<ComunicacaoDTO> getCominucacoes() {
        return comunicacoes;
    }

    /**
     * Retorna atributo 'dadoDemografico'.
     *
     * @return the dadoDemografico.
     */
    @XmlElement
    public final DadoDemograficoDTO getDadoDemografico() {
        return dadoDemografico;
    }

    /////////////////////////////////////////////
    // Metodos fromJson; toJson; fromXml e toXml.
    /////////////////////////////////////////////

    /**
     * Metodo que transforma um objeto do tipo IndividuoDTO em uma string
     * contendo um json correspondente.
     *
     * @param individuos lista de objetos IndividuoDTO.
     * @throws IOException erro IO.
     */
    /**
     *
     * @param individuo objeto IndividuoDTO.
     * @return string com o conteudo json.
     * @throws IOException erro IO.
     */
    public final String toJson(final IndividuoDTO individuo)
            throws IOException {
        Gson gson = new GsonBuilder().create();
        String conteudoJson = gson.toJson(individuo, IndividuoDTO.class)
                .toString();
        return conteudoJson;

    }

    /**
     * Metodo que transforma uma string correspondente q um arquivo json em um
     * objeto do tipo IndividuoDTO.
     *
     * @param json string contendo um json.
     * @return objeto IndividuoDTO.
     */
    public final IndividuoDTO fromJson(final String json) {
        Gson gson = new GsonBuilder().create();
        IndividuoDTO individuo = gson.fromJson(json, IndividuoDTO.class);
        return individuo;

    }

    /**
     * Metodo que cria um xml baseado em um objeto IndividuoDTO.
     *
     * @param individuo objeto IndividuoDTO.
     * @return String string contendo um xml.
     * @throws JAXBException erro JAXB.
     */
    public final String toXml(final IndividuoDTO individuo)
            throws JAXBException {
        StringWriter sw = new StringWriter();
        JAXBContext jaxbContext = JAXBContext.newInstance(IndividuoDTO.class);
        Marshaller jaxbMarsh = jaxbContext.createMarshaller();
        jaxbMarsh.marshal(individuo, sw);
        String conteudoXml = sw.toString();
        return conteudoXml;
    }

    /**
     * Método que obtem um objeto IndividuoDTO através de um arquivo xml.
     *
     * @param xml Conteúdo do xml.
     * @return objeto IndividouDTO.
     * @throws JAXBException erro JAXB.
     */
    public final IndividuoDTO fromXml(final String xml) throws JAXBException {
        StringReader sr = new StringReader(xml);
        JAXBContext jaxbContext = JAXBContext.newInstance(IndividuoDTO.class);
        Unmarshaller jaxbUnmarsh = jaxbContext.createUnmarshaller();
        IndividuoDTO individuo = (IndividuoDTO) jaxbUnmarsh.unmarshal(sr);
        return individuo;
    }

    /**
     * Método auxiliar que lê um arquivo local e retorna uma String com o
     * conteudo do arquivo.
     *
     * @param nomeArq Nome do arquivo local.
     * @return string correspondente ao arquivo.
     * @throws IOException erro IO.
     */
    public final String lerArquivoLocal(final String nomeArq)
            throws IOException {
        try {
            FileReader arq = new FileReader(nomeArq);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine();
            }
            arq.close();
            return linha;
        } catch (IOException e) {
            throw new IOException("NAO FOI POSSIVEL LER O ARQUIVO");
        }

    }

    /**
     * Metodo que cria um arquivo local.
     *
     * @param nomeArquivo Nome do arquivo a ser criado.
     * @param conteudo COnteudo do arquivo a ser criado.
     * @throws IOException erro IO.
     */
    public final void criaArquivo(final String nomeArquivo,
            final String conteudo) throws IOException {
        try (FileWriter fw = new FileWriter(nomeArquivo)) {
            fw.write(conteudo);
        } catch (IOException ioe) {
            throw new IOException(
                    "NAO FOI POSSIVEL CRIAR O ARQUIVO " + nomeArquivo);
        }
    }

}
