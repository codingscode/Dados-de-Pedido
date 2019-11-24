package model.entidades;

public class Produto {

	private String nomeprod;
	private Double precoprod;
	
	public Produto(String nomeprod, Double precoprod) {
		this.nomeprod = nomeprod;
		this.precoprod = precoprod;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public Double getPrecoprod() {
		return precoprod;
	}

	public void setPrecoprod(Double precoprod) {
		this.precoprod = precoprod;
	}
	
		
}
