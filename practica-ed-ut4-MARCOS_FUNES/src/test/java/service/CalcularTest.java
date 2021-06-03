package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase encargada de realizar los test a su respectiva clase (Calcular.java).
 * 
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class CalcularTest {

	Calcular calcularTest = new Calcular();

	/**
	 * Test encargado de la comprobacion del metodo de generacion de numeros
	 * aleatorios.
	 */
	@Test
	public void genera0_ok() {
		double randomTest = calcularTest.generaNumeroRandom(0);
		Assertions.assertEquals(0, randomTest);
	}

	/**
	 * Test encargado de la comprobacion del metodo del calculo de margen.
	 */
	@Test
	public void calcularMargenBeneficio_ok() {
		double margenTotal = calcularTest.calculaMargen(15.0, 10.0);
		Assertions.assertEquals(33.33, margenTotal);
	}
	
	/**
	 * Test encargado de comprobar el metodo calculo de margen (funcionalidad negativa correcta).
	 */
	@Test
	public void calcularMargenBeneficio_NotOk() {
		double margenTotal = calcularTest.calculaMargen(15.0, 10.0);
		Assertions.assertNotEquals(0, margenTotal);
	}

	/**
	 * Test encargado de la comprobacion del metodo de calculo de nuevo precio.
	 */
	@Test
	public void calculoNuevoPrecio_ok() {
		double nuevoPrecio = calcularTest.calcularNuevoPrecio(10.0);
		Assertions.assertEquals(11.11, nuevoPrecio);
	}
	
	/**
	 * Test encargado de comprobar el metodo calculo de nuevo precio (funcionalidad negativa correcta).
	 */
	@Test
	public void calculoNuevoPrecio_Notok() {
		double nuevoPrecio = calcularTest.calcularNuevoPrecio(10.0);
		Assertions.assertNotEquals(0, nuevoPrecio);
	}

	/**
	 * Test encargado de la comprobacion del metodo de calculo de beneficio total.
	 */
	@Test
	public void calcularBeneficioTotal_ok() {
		double beneficioTotal = calcularTest.calcularBeneficioTotal(0.0, 15.0, 10.0);
		Assertions.assertEquals(5.0, beneficioTotal);
	}
	
	/**
	 * Test encargado de comprobar el metodo calculo de beneficio total (funcionalidad negativa correcta).
	 */
	@Test
	public void calcularBeneficioTotal_Notok() {
		double beneficioTotal = calcularTest.calcularBeneficioTotal(0.0, 15.0, 10.0);
		Assertions.assertNotEquals(0, beneficioTotal);
	}
}
