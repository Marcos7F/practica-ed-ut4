package service;

import entity.Tienda;
import entity.Producto;

/**
 * Clase encargada de generar por consola diferentes aspectos de la tienda generada.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class MostrarValores {
	/**
	 * Metodo que muestra por consola los precios de los productos generados en la tienda.
	 * @param tienda Tienda generada que contiene productos aleatorios.
	 */
	public void mostrarPrecios(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		System.out.println("");
		System.out.print("Los precios de los productos son: ");
		for(int i=0; i<tienda.getProductos().length; i++) {
			System.out.print(producto[i].getPrecio());
			if(i!=tienda.getProductos().length-1) {
				System.out.print(" ,");
			}
		} 
	}
	/**
	 * Metodo que muestra por consola los costes de los productos generados en la tienda.
	 * @param tienda Tienda generada que contiene productos aleatorios.
	 */
	public void mostrarCostes(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		System.out.println("");
		System.out.print("Los costes de los productos son: ");
		for(int i=0; i<tienda.getProductos().length; i++) {
			System.out.print(producto[i].getCoste());
			if(i!=tienda.getProductos().length-1) {
				System.out.print(" ,");
			}
		}
	}

	/**
	 * Metodo que muestra por pantalla los precios nuevos generados en productos seleccionados al azar; los cuales han sido seleccionados a raiz de su coste..
	 * @param tienda Tienda generada que contiene productos aleatorios.
	 */
	public void mostrarNuevoPrecio(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		System.out.println("");
		System.out.println("Los nuevos precios de los productos son: ");
		for(int i=0; i<tienda.getProductos().length; i++) {
			if(producto[i].getNuevoPrecio()!= 0) {
				System.out.print("Producto "+ producto[i].getIdProducto() +": ");
				System.out.println(producto[i].getNuevoPrecio());
			}
		} 
	}
	/**
	 * Metodo que muestra por pantalla los margenes de beneficio de cada producto.
	 * @param tienda Tienda generada que contiene productos aleatorios.
	 */
	public void mostrarMargen(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		System.out.println("");
		System.out.print("Los margenes de beneficio de los productos son: ");
		for(int i=0; i<tienda.getProductos().length; i++) {
			System.out.print(producto[i].getMargen());
			if(i!=tienda.getProductos().length-1) {
				System.out.print(" ,");
			}
		}
	}
}
