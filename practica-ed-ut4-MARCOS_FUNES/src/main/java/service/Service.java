package service;

import entity.Tienda;
import entity.Producto;

/**
 * Clase encargada de realizar los servicios principales del proyecto.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class Service {
	/**
	 * Metodo que calcula el margen de beneficio de todos los productos generados.
	 * @param tienda Tienda generada que contiene los productos.
	 */
	public void calculaMargenBenef(Tienda tienda) {
		Calcular calcular=new Calcular();
		Producto[] producto=tienda.getProductos();
		for(int i=0; i<tienda.getProductos().length; i++) {
			producto[i].setMargen(calcular.calculaMargen(producto[i].getPrecio(), producto[i].getCoste()));
		}
	} 

	/**
	 * Metodo que calcula el beneficio total de todos los productos generados.
	 * @param tienda Tienda generada que contiene los productos.
	 */
	public void benefTotal(Tienda tienda) { 
		double resultado=0;
		Calcular calcular=new Calcular();
		Producto[] producto=tienda.getProductos();
		for(int i=0; i<tienda.getProductos().length; i++) {
			resultado=calcular.calcularBeneficioTotal(resultado, 
					producto[i].getPrecio(), producto[i].getCoste());
		} 
		tienda.setBeneficioTotal(resultado);
	}
	/**
	 * Metodo que calcula los precios nuevos a todo producto que cuente con un margen menor a 10.
	 * @param tienda Tienda generada que contiene los productos.
	 */
	public void calcularNuevoPrecioProduct(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		for (int i = 0; i <tienda.getProductos().length; i++) {
            if (producto[i].getMargen() < 10) {
            	Calcular calcular=new Calcular();
                producto[i].setNuevoPrecio(
                		calcular.calcularNuevoPrecio(producto[i].getCoste()));
            }
        }
	}
	/**
	 * Metodo que calcula el id del producto cuyo margen sea el mayor.
	 * @param tienda Tienda generada que contiene los productos.
	 * @return resultado Devuelve el id del producto que haya cumplido con el metodo.
	 */
	public int calcularIdMaximo(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		double valorMax=-999999;
		int resultado=0;
		
		for(int i=0; i<tienda.getProductos().length; i++) {
			if (producto[i].getMargen()>valorMax) {
            	valorMax=producto[i].getMargen();
                resultado =producto[i].getIdProducto();
			}
		}
		tienda.setMaxMargen(valorMax);
		return resultado;
	}
	/**
	 * Metodo que calcula y devuelve el id del producto cuyo margen sea el minimo.
	 * @param tienda Tienda generada que contiene los productos.
	 * @return resultado Devuelve el id del producto que haya cumplido con el metodo.
	 */
	public int calcularIdMin(Tienda tienda) {
		Producto[] producto=tienda.getProductos();
		double valorMin=999999;
		int resultado=0;
		
		for(int i=0; i<tienda.getProductos().length; i++) {
			if (producto[i].getMargen()<valorMin) {
            	valorMin=producto[i].getMargen();
                resultado=producto[i].getIdProducto();
			}
		}
		tienda.setMinMargen(valorMin);
		return resultado;
	}
}