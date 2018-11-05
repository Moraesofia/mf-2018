package com.github.moraesofia.dto;

import java.util.List;

/**
 * Classe Nome que contem os atributos relevantes para a identificação do
 * paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 * 
 * @author aluno
 *
 */
public class NomeDTO {

	/**
	 * 
	 */
	private final String titulos;

	/**
	 * 
	 */
	private final String nomes;

	/**
	 * 
	 */
	private final String sobrenomes;

	/**
	 * 
	 */
	private final String sufixos;

	/**
	 * 
	 */
	private final String preferido;

	/**
	 * 
	 */
	private final String usoCondicional;

	/**
	 * 
	 */
	private final String uso;

	/**
	 * 
	 */
	private final String dataIncio;

	/**
	 * 
	 */
	private final String dataFim;

	/**
	 *
	 */
	private List<RepresentacaoDTO> representacao;

	/**
	 * @param titulos
	 * @param nomes
	 * @param sobrenomes
	 * @param sufixos
	 * @param preferido
	 * @param usoCondicional
	 * @param uso
	 * @param dataIncio
	 * @param dataFim
	 */
	public NomeDTO(final String titulos, final String nomes, final String sobrenomes, final String sufixos,
			final String preferido, final String usoCondicional, final String uso, final String dataIncio,
			final String dataFim, final List<RepresentacaoDTO> representacao) {
		super();
		this.titulos = titulos;
		this.nomes = nomes;
		this.sobrenomes = sobrenomes;
		this.sufixos = sufixos;
		this.preferido = preferido;
		this.usoCondicional = usoCondicional;
		this.uso = uso;
		this.dataIncio = dataIncio;
		this.dataFim = dataFim;
		this.setRepresentacao(representacao);
	}

	/**
	 * @return the titulos
	 */
	public final String getTitulos() {
		return titulos;
	}

	/**
	 * @return the nomes
	 */
	public final String getNomes() {
		return nomes;
	}

	/**
	 * @return the sobrenomes
	 */
	public final String getSobrenomes() {
		return sobrenomes;
	}

	/**
	 * @return the sufixos
	 */
	public final String getSufixos() {
		return sufixos;
	}

	/**
	 * @return the preferido
	 */
	public final String getPreferido() {
		return preferido;
	}

	/**
	 * @return the usoCondicional
	 */
	public final String getUsoCondicional() {
		return usoCondicional;
	}

	/**
	 * @return the uso
	 */
	public final String getUso() {
		return uso;
	}

	/**
	 * @return the dataIncio
	 */
	public final String getDataIncio() {
		return dataIncio;
	}

	/**
	 * @return the dataFim
	 */
	public final String getDataFim() {
		return dataFim;
	}

	public List<RepresentacaoDTO> getRepresentacao() {
		return representacao;
	}

	public void setRepresentacao(List<RepresentacaoDTO> representacao) {
		this.representacao = representacao;
	}

}