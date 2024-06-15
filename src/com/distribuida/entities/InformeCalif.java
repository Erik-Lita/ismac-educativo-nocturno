package com.distribuida.entities;

public class InformeCalif {

	
	private int idInformeCalif;
	private String NumEstudiante;
	private Estudiante estudiante;
	private String IDSeccion;
	private Seccion seccion;
	private String Nota;
	
 
	
	
	
	public InformeCalif () {}



	public InformeCalif(int idInformeCalif, String numEstudiante, String iDSeccion, String nota) {
	
		this.idInformeCalif = idInformeCalif;
		NumEstudiante = numEstudiante;
		IDSeccion = iDSeccion;
		Nota = nota;
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



	public String getIDSeccion() {
		return IDSeccion;
	}



	public void setIDSeccion(String iDSeccion) {
		IDSeccion = iDSeccion;
	}



	public String getNota() {
		return Nota;
	}



	public void setNota(String nota) {
		Nota = nota;
	}



	@Override
	public String toString() {
		return "InformeCalif [idInformeCalif=" + idInformeCalif + ", NumEstudiante=" + NumEstudiante + ", IDSeccion="
				+ IDSeccion + ", Nota=" + Nota + "]";
	}
	
	
	
}
