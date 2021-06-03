package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Producto;
import entity.Tienda;

/**
 * Clase encargada de realizar los test a su respectiva clase
 * (MostrarValores.java).
 * 
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class MostrarValoresTest {

	MostrarValores menuTest = new MostrarValores();

	/**
	 * Test encargado de la comprobacion del metodo de mostrar los precios de todos
	 * los productos.
	 */
	@Test
	public void procesoMostrarPrecios_Ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[1] = new Producto(20.0, 30.0);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarPrecios(tiendaTest1);
		Assertions.assertEquals(30.0, tiendaTest1.getProductos()[1].getPrecio());
	}
	
	/**
	 * Test encargado de mostrar precios (funcionalidad negativa correcta).
	 */
	@Test
	public void procesoMostrarPrecios_NotOk() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[1] = new Producto(20.0, 30.0);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarPrecios(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getProductos()[1].getPrecio());
	}

	/**
	 * Test encargado de la comprobacion del metodo de mostrar los costes de todos
	 * los productos.
	 */
	@Test
	public void procesoMostrarCostes_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[1] = new Producto(20.0, 30.0);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarCostes(tiendaTest1);
		Assertions.assertEquals(20.0, tiendaTest1.getProductos()[1].getCoste());
	}
	
	/**
	 * Test encargado de mostrar costes (funcionalidad negativa correcta).
	 */
	@Test
	public void procesoMostrarCostes_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[1] = new Producto(20.0, 30.0);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarCostes(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getProductos()[1].getCoste());
	}

	/**
	 * Test encargado de la comprobacion del metodo de mostrar el nuevo precio de
	 * ciertos productos.
	 */
	@Test
	public void procesoMostrarNuevoPrecio_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[0].setNuevoPrecio(30.0);
		producto[0].setIdProducto(1);
		producto[1] = new Producto(10.0, 20.0);
		producto[1].setNuevoPrecio(0.0);
		producto[1].setIdProducto(2);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarNuevoPrecio(tiendaTest1);
		Assertions.assertEquals(30.0, tiendaTest1.getProductos()[0].getNuevoPrecio());
	}
	
	/**
	 * Test encargado de mostrar el nuevo precio (funcionalidad negativa correcta).
	 */
	@Test
	public void procesoMostrarNuevoPrecio_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[0].setNuevoPrecio(30.0);
		producto[0].setIdProducto(1);
		producto[1] = new Producto(10.0, 20.0);
		producto[1].setNuevoPrecio(0.0);
		producto[1].setIdProducto(2);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarNuevoPrecio(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getProductos()[0].getNuevoPrecio());
	}

	/**
	 * Test encargado de la comprobacion del metodo de mostrar el margen de
	 * beneficio de todos los productos.
	 */
	@Test
	public void procesoMostrarMargen_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[0].setMargen(50.0);
		producto[1] = new Producto(20.0, 30.0);
		producto[1].setMargen(33.3);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarMargen(tiendaTest1);
		Assertions.assertEquals(33.3, tiendaTest1.getProductos()[1].getMargen());
	}
	
	/**
	 * Test encargado de mostrar el margen de beneficio (funcionalidad negativa correcta).
	 */
	@Test
	public void procesoMostrarMargen_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[0].setMargen(50.0);
		producto[1] = new Producto(20.0, 30.0);
		producto[1].setMargen(33.3);
		tiendaTest1.setProductos(producto);
		menuTest.mostrarMargen(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getProductos()[1].getMargen());
	}
}
