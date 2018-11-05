package com.github.moraesofia.dto;

/**
 * Classe Identificador que contem os atributos relevantes para a identificação
 * do paciente.
 * <p>
 * Para mais informações, consulte o "package.info".
 * 
 * @author aluno
 *
 */
public class IdentificadorDTO {

	/**
	 * 
	 */
	private final String designacao;

	/**
	 * 
	 */
	private final String area;

	/**
	 * 
	 */
	private final String emissor;

	/**
	 * 
	 */
	private final String data;

	/**
	 * 
	 */
	private final String tipo;

	/**
	 * 
	 */
	private final String uso;

	/**
	 * 
	 */
	private final String dataInicio;

	/**
	 * 
	 */
	private final String dataFinal;
	

	/**
	 * @param designacao
	 * @param area
	 * @param emissor
	 * @param data
	 * @param tipo
	 * @param uso
	 * @param dataInicio
	 * @param dataFinal
	 */
	public IdentificadorDTO(final String designacao, final String area, final String emissor, final String data,
			final String tipo, final String uso, final String dataInicio, final String dataFinal) {
		super();
		this.designacao = designacao;
		this.area = area;
		this.emissor = emissor;
		this.data = data;
		this.tipo = tipo;
		this.uso = uso;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	/**
	 * @return the designacao
	 */
	public final String getDesignacao() {
		return designacao;
	}

	/**
	 * @return the area
	 */
	public final String getArea() {
		return area;
	}

	/**
	 * @return the emissor
	 */
	public final String getEmissor() {
		return emissor;
	}

	/**
	 * @return the data
	 */
	public final String getData() {
		return data;
	}

	/**
	 * @return the tipo
	 */
	public final String getTipo() {
		return tipo;
	}

	/**
	 * @return the uso
	 */
	public final String getUso() {
		return uso;
	}

	/**
	 * @return the dataInicio
	 */
	public final String getDataInicio() {
		return dataInicio;
	}

	/**
	 * @return the dataFinal
	 */
	public final String getDataFinal() {
		return dataFinal;
	}

}
