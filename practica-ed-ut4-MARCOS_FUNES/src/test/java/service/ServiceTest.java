package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Producto;
import entity.Tienda;

/**
 * Clase encargada de realizar los test a su respectiva clase (Service.java).
 * 
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class ServiceTest {

	Calcular calcularTest = new Calcular();
	Service serviceTest = new Service();

	/**
	 * Test encargado de la comprobacion del metodo que calcula el margen de
	 * beneficio de los productos.
	 */
	@Test
	public void calcularMargenBeneficio_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(10.0, 20.0);
		tiendaTest1.setProductos(producto);
		calcularTest.calculaMargen(tiendaTest1.getProductos()[0].getPrecio(),
				tiendaTest1.getProductos()[0].getPrecio());
		serviceTest.calculaMargenBenef(tiendaTest1);
		Assertions.assertEquals(50.0, tiendaTest1.getProductos()[0].getMargen());
	}
	
	/**
	 * Test encargado de comprobar el metodo calculo de margen de beneficio (funcionalidad negativa correcta).
	 */
	@Test
	public void calcularMargenBeneficio_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(10.0, 20.0);
		tiendaTest1.setProductos(producto);
		calcularTest.calculaMargen(tiendaTest1.getProductos()[0].getPrecio(),
				tiendaTest1.getProductos()[0].getPrecio());
		serviceTest.calculaMargenBenef(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getProductos()[0].getMargen());
	}

	/**
	 * Test encargado de la comprobacion del metodo que calcula el beneficio total
	 * de los productos.
	 */
	@Test
	public void calculaBeneficioTotal_ok() {
		double resultadoTest = 0.0;
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(10.0, 20.0);
		tiendaTest1.setProductos(producto);
		calcularTest.calcularBeneficioTotal(resultadoTest, tiendaTest1.getProductos()[0].getPrecio(),
				tiendaTest1.getProductos()[0].getPrecio());
		serviceTest.benefTotal(tiendaTest1);
		Assertions.assertEquals(10.0, tiendaTest1.getBeneficioTotal());
	}
	
	/**
	 * Test encargado de la comprobacion del metodo de calculo de beneficio total (funcionalidad negativa correcta).
	 */
	@Test
	public void calculaBeneficioTotal_Notok() {
		double resultadoTest = 0.0;
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(10.0, 20.0);
		tiendaTest1.setProductos(producto);
		calcularTest.calcularBeneficioTotal(resultadoTest, tiendaTest1.getProductos()[0].getPrecio(),
				tiendaTest1.getProductos()[0].getPrecio());
		serviceTest.benefTotal(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getBeneficioTotal());
	}

	/**
	 * Test encargado de la comprobacion del metodo de calcular el precio nuevo de
	 * los productos.
	 */
	@Test
	public void calcularNuevoPrecio_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(20.0, 20.0);
		producto[0].setMargen(1);
		tiendaTest1.setProductos(producto);
		calcularTest.calcularNuevoPrecio(tiendaTest1.getProductos()[0].getCoste());
		serviceTest.calcularNuevoPrecioProduct(tiendaTest1);
		Assertions.assertEquals(22.22, tiendaTest1.getProductos()[0].getNuevoPrecio());
	}
	
	/**
	 * Test encargado de la comprobacion del metodo de calcular el nuevo precio (funcionalidad negativa correcta).
	 */
	@Test
	public void calcularNuevoPrecio_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(20.0, 20.0);
		producto[0].setMargen(1);
		tiendaTest1.setProductos(producto);
		calcularTest.calcularNuevoPrecio(tiendaTest1.getProductos()[0].getCoste());
		serviceTest.calcularNuevoPrecioProduct(tiendaTest1);
		Assertions.assertNotEquals(0, tiendaTest1.getProductos()[0].getNuevoPrecio());
	}

	/**
	 * Test encargado de la comprobacion del metodo de calcular el precio nuevo
	 * (pasando por el if del metodo).
	 */
	@Test
	public void calcularNuevoPrecio_ifOk() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[1];
		producto[0] = new Producto(20.0, 10.0);
		producto[0].setMargen(11);
		tiendaTest1.setProductos(producto);
		calcularTest.calcularNuevoPrecio(tiendaTest1.getProductos()[0].getCoste());
		serviceTest.calcularNuevoPrecioProduct(tiendaTest1);
		Assertions.assertEquals(0.0, tiendaTest1.getProductos()[0].getNuevoPrecio());
	}

	/**
	 * Test encargado de la comprobacion del metodo de calcular el id maximo de un
	 * producto.
	 */
	@Test
	public void calcularIDMax_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[0].setIdProducto(5);
		producto[1] = new Producto(20.0, 20.0);
		producto[1].setIdProducto(3);
		tiendaTest1.setProductos(producto);
		Assertions.assertEquals(5, serviceTest.calcularIdMaximo(tiendaTest1));
	}
	
	/**
	 * Test encargado del metodo de calculo de mayor ID (funcionalidad negativa correcta).
	 */
	@Test
	public void calcularIDMax_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(10.0, 20.0);
		producto[0].setIdProducto(5);
		producto[1] = new Producto(20.0, 20.0);
		producto[1].setIdProducto(3);
		tiendaTest1.setProductos(producto);
		Assertions.assertNotEquals(0, serviceTest.calcularIdMaximo(tiendaTest1));
	}

	/**
	 * Test encargado de la comprobacion del metodo de calcular el id minimo de un
	 * producto.
	 */
	@Test
	public void calcularIDMin_ok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(20.0, 20.0);
		producto[0].setIdProducto(6);
		producto[1] = new Producto(10.0, 20.0);
		producto[1].setIdProducto(9);
		tiendaTest1.setProductos(producto);
		Assertions.assertEquals(6, serviceTest.calcularIdMin(tiendaTest1));
	}
	 /**
	  * Test encargado del metodo de calculo menor ID (funcionalidad negativa correcta).
	  */
	@Test
	public void calcularIDMin_Notok() {
		Tienda tiendaTest1 = new Tienda();
		Producto[] producto = new Producto[2];
		producto[0] = new Producto(20.0, 20.0);
		producto[0].setIdProducto(6);
		producto[1] = new Producto(10.0, 20.0);
		producto[1].setIdProducto(9);
		tiendaTest1.setProductos(producto);
		Assertions.assertNotEquals(0, serviceTest.calcularIdMin(tiendaTest1));
	}

}