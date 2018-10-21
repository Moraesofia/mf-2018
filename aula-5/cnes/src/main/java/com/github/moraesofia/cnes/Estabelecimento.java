package com.github.moraesofia.cnes;

public class Estabelecimento {

	private String codigo;
	
	private String razaoSocial;
	
	private String latitude;
	
	private String longitude;	

	public Estabelecimento(String codigo, String razaoSocial, String latitude, String longitude) {
		super();
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}
	
	
	
}
