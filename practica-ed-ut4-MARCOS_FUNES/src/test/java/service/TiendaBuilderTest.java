package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Tienda;

/**
 * Clase encargada de realizar los test a su respectiva clase (TiendaBuilder.java).
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class TiendaBuilderTest {

	/**
	 * Test encargado de la comprobacion del metodo que construye una tienda; que no sea null.
	 */
	@Test
	public void construirTiendaOk() {
		TiendaBuilder tiendaBTest = new TiendaBuilder();
		Assertions.assertNotEquals(null, tiendaBTest.construirTienda());
	}
	/**
	 * Test encargado de la comprobacion del metodo que genera el array de productos; que el tamanio sea el correcto.
	 */
	@Test
	public void generaProductosTamanio_ok() {
		TiendaBuilder tiendaBTest2 = new TiendaBuilder();
		Tienda tiendaTest2 = new Tienda();
		Assertions.assertEquals(20, tiendaBTest2.generaArrayProductos(tiendaTest2).length);
	} 
	
	/**
	 * Test encargado de revisar el tamanio correcto (funcionalidad neagtiva correcta)
	 */
	@Test
	public void generaProductosTamanio_Notok() {
		TiendaBuilder tiendaBTest3 = new TiendaBuilder();
		Tienda tiendaTest3 = new Tienda();
		Assertions.assertNotEquals(0, tiendaBTest3.generaArrayProductos(tiendaTest3).length);
	} 
}
