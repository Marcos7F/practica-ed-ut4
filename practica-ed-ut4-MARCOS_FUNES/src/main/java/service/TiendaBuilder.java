package service;

import entity.Producto;
import entity.Tienda;

/**
 * Clase encargada de construir una tienda completa.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class TiendaBuilder {
	//constantes
	/**
	 * Constante que fija el tamaño del array de los productos generados.
	 */
	public static final int PRODUCTOS=20;
	/**
	 * Constante que fija el valor maximo del precio de los productos generados.
	 */
	private final int MAX_PRECIO=2000;
	/**
	 * Constante que fija el valor maximo del coste de los productos generados.
	 */
	private final int MAX_COSTE=1000;
	/**
	 * Metodo encargado de construir una tienda con los productos instanciados
	 * @return tienda Devuelve una tienda generada que contiene productos aleatorios.
	 */
	public Tienda construirTienda() {
		Tienda tienda=new Tienda();
		tienda.setProductos(generaArrayProductos(tienda));
		return tienda;
	}
	
	/**
	 * Metodo que genera los productos de forma aleatoria para la tienda
	 * @param tienda Tienda generada que contiene productos aleatorios.
	 * @return productos Devuelve un array que contiene productos aleatorios.
	 */
	public Producto[] generaArrayProductos(Tienda tienda) {
		Producto[] productos=new Producto[PRODUCTOS];
		for(int i=0; i<productos.length; i++) {
			productos[i]=new Producto();
		} 
		Calcular random=new Calcular();
		for(int i=0; i<PRODUCTOS; i++) {
			productos[i].setCoste(random.generaNumeroRandom(MAX_COSTE));
			productos[i].setPrecio(random.generaNumeroRandom(MAX_PRECIO));
			productos[i].setIdProducto(i+1);
		} 
		return productos;
	}
	
}