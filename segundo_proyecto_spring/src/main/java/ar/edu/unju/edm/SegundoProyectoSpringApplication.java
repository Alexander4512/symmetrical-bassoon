package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.Calculadora_Controller;

@SpringBootApplication
public class SegundoProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoSpringApplication.class, args);
		
		Calculadora_Controller nuevoControlador = new Calculadora_Controller();
		nuevoControlador.resolverSuma();
	}

}
