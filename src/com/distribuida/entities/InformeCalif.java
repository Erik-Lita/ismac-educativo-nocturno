package com.distribuida.entities;

public class InformeCalif {

	
	private int idInformeCalif;
	private String NumEstudiante;
	private String Nota;
	private InformeCalif informecalif;
	
	public InformeCalif () {}

	public InformeCalif(int idInformeCalif, String numEstudiante, String nota, InformeCalif informecalif) {
		
		this.idInformeCalif = idInformeCalif;
		this.NumEstudiante = numEstudiante;
		this.Nota = nota;
		this.informecalif = informecalif;
	}

	public int getIdInformeCalif() {
		return idInformeCalif;
	}

	public void setIdInformeCalif(int idInformeCalif) {
		this.idInformeCalif = idInformeCalif;
	}

	public String getNumEstudiante() {
		return NumEstudiante;
	}

	public void setNumEstudiante(String numEstudiante) {
		NumEstudiante = numEstudiante;
	}

	public String getNota() {
		return Nota;
	}

	public void setNota(String nota) {
		Nota = nota;
	}

	public InformeCalif getInformecalif() {
		return informecalif;
	}

	public void setInformecalif(InformeCalif informecalif) {
		this.informecalif = informecalif;
	}

	@Override
	public String toString() {
		return "InformeCalif [idInformeCalif=" + idInformeCalif + ", NumEstudiante=" + NumEstudiante + ", Nota=" + Nota
				+ ", informecalif=" + informecalif + "]";
	}
	
	
	
	
}