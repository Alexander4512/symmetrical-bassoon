package ar.edu.unju.edm.controller;
import ar.edu.unju.edm.model.Calculadora;

public class Calculadora_Controller {
	
	public void resolverSuma(){

	int a=10,b=20;
	
	Calculadora nuevaCalculadora = new Calculadora();
	
	nuevaCalculadora.setA(a);
	nuevaCalculadora.setB(b);
	
	System.out.println("El resultado de la suma es"+ nuevaCalculadora.sumarDosNumeros());
	nuevaCalculadora.sumarDosNumeros();
	}
}


