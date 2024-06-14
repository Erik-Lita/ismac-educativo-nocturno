package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EstudianteDAO;
import com.distribuida.entities.Estudiante;

public class PrincipalEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patron de IoC o Inversion de control
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");

		EstudianteDAO estudianteDAO =context.getBean("clienteDAOImpl",EstudianteDAO.class);
		List <Estudiante> clientes=estudianteDAO.findAll();
		clientes.forEach(item ->{
			
			System.out.println(item.toString());
		});
		
		context.close();
	}

}
