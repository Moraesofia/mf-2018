package com.github.moraesofia.dto;

public class RepresentacaoDTO {

	/**
	 * 
	 */
	private String utilizacao;
	
	/**
	 * 
	 */
	private String alternativa;

	/**
	 * @param utilizacao
	 * @param alternativa
	 */
	public RepresentacaoDTO(String utilizacao, String alternativa) {
		super();
		this.utilizacao = utilizacao;
		this.alternativa = alternativa;
	}

	/**
	 * @return the utilizacao
	 */
	public final String getUtilizacao() {
		return utilizacao;
	}

	/**
	 * @return the alternativa
	 */
	public final String getAlternativa() {
		return alternativa;
	}

	/**
	 * @param utilizacao the utilizacao to set
	 */
	public final void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}

	/**
	 * @param alternativa the alternativa to set
	 */
	public final void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	
	
}
