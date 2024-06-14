package com.distribuida.entities;

public class Estudiante {

	private int idEstudiante;
	private String Nombre;
	private String NumEstudiante;
	private String Clase;
	
	public Estudiante () {}

	public Estudiante(int idEstudiante, String nombre, String numEstudiante, String clase) {
	
		this.idEstudiante = idEstudiante;
		this.Nombre = nombre;
		this.NumEstudiante = numEstudiante;
		this.Clase = clase;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getNumEstudiante() {
		return NumEstudiante;
	}

	public void setNumEstudiante(String numEstudiante) {
		NumEstudiante = numEstudiante;
	}

	public String getClase() {
		return Clase;
	}

	public void setClase(String clase) {
		Clase = clase;
	}

	@Override
	public String toString() {
		return "Curso [idEstudiante=" + idEstudiante + ", Nombre=" + Nombre + ", NumEstudiante=" + NumEstudiante
				+ ", Clase=" + Clase + "]";
	}
	
	
}