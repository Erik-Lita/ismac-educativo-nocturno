package com.distribuida.entities;

public class Curso {

	
	private int idCurso;
	private String NombreCurso;
	private String NumCurso;
	private String Horas;
	private String Departamento;
	
	public Curso () {}

	public Curso(int idCurso, String nombreCurso, String numCurso, String horas, String departamento) {
		
		this.idCurso = idCurso;
		this.NombreCurso = nombreCurso;
		this.NumCurso = numCurso;
		this.Horas = horas;
		this.Departamento = departamento;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return NombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		NombreCurso = nombreCurso;
	}

	public String getNumCurso() {
		return NumCurso;
	}

	public void setNumCurso(String numCurso) {
		NumCurso = numCurso;
	}

	public String getHoras() {
		return Horas;
	}

	public void setHoras(String horas) {
		Horas = horas;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", NombreCurso=" + NombreCurso + ", NumCurso=" + NumCurso + ", Horas="
				+ Horas + ", Departamento=" + Departamento + "]";
	}

	
	
	
	
	
	
}
