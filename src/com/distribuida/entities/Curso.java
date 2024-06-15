package com.distribuida.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.stereotype.Component;
 
@Component
@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Curso")
	private int id_Curso;
	@Column(name="NombreCurso")
	private String NombreCurso;
	@Column(name="NumCurso")
	private String NumCurso;
	@Column(name="Horas")
	private String Horas;
	@Column(name="Departamento")
	private String Departamento;
	
	public Curso () {}
	

	public Curso(int idCurso, String nombreCurso, String numCurso, String horas, String departamento) {
		
		this.id_Curso = idCurso;
		this.NombreCurso = nombreCurso;
		this.NumCurso = numCurso;
		this.Horas = horas;
		this.Departamento = departamento;
	}

	public int getIdCurso() {
		return id_Curso;
	}

	public void setIdCurso(int idCurso) {
		this.id_Curso = idCurso;
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
		return "Curso [idCurso=" + id_Curso + ", NombreCurso=" + NombreCurso + ", NumCurso=" + NumCurso + ", Horas="
				+ Horas + ", Departamento=" + Departamento + "]";
	}

	
	
	
	
	
	
}
