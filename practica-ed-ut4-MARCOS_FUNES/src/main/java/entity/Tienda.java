package entity;

import service.TiendaBuilder;

/**
 * Clase entidad para la tienda generada.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class Tienda {
	/**
	 * Array de productos.
	 */
	private Producto[] productos=new Producto[TiendaBuilder.PRODUCTOS];
	/**
	 * Beneficio total de la tienda.
	 */
	private double beneficioTotal;
	/**
	 * Margen maximo de beneficio de la tienda.
	 */
	private double maxMargen;
	/**
	 * Margen minimo de beneficio de la tienda.
	 */
	private double minMargen;
	/**
	 * Id del producto con margen maximo de la tienda.
	 */
	private int idMaxMargen;
	/**
	 * Id del producto con margen minimo de la tienda.
	 */
	private int idMinMargen;
	/**
	 * Constructor de la tienda generada.
	 */
	public Tienda() {
		beneficioTotal=0;
		maxMargen=0;
	}
	
	/**
	 * Metodo encargado de generar un array de productos ya generados.
	 * @return productos Devolvera productos de forma aleatoria.
	 */
	public Producto[] getProductos() {
		return productos;
	}
	/**
	 * Metodo encargado de generar productos con valores aleatorios.
	 * @param p El parametro p es una referencia a los productos generados.
	 */
	public void setProductos(Producto[] p) {
		this.productos = p;
	}
	/**
	 * Metodo encargado de devolver el beneficio total de la tienda.
	 * @return beneficioTotal Devolvera el beneficio total de la tienda.
	 */
	public double getBeneficioTotal() {
		return beneficioTotal;
	}
	/**
	 * Metodo encargado de asignar un valor a beneficio total.
	 * @param beneficioTotal Contendra el beneficio total asignado a la tienda.
	 */
	public void setBeneficioTotal(double beneficioTotal) {
		this.beneficioTotal = beneficioTotal;
	}
	/**
	 * Metodo encargado de devolver el margen maximo de beneficio.
	 * @return maxMargen Devolvera el margen maximo de beneficio.
	 */
	public double getMaxMargen() {
		return maxMargen;
	}
	/**
	 * Metodo encargado de asignar un valor al margen maximo de beneficio.
	 * @param maxMargen Contendra el valor del margen maximo.
	 */
	public void setMaxMargen(double maxMargen) {
		this.maxMargen = maxMargen;
	}
	/**
	 * Metodo encargado de devolver el margen minimo de beneficio.
	 * @return minMargen Devolvera el margen minimo de beneficio.
	 */
	public double getMinMargen() {
		return minMargen;
	}
	/**
	 * Metodo encargado de asignar un valor al margen minimo de beneficio.
	 * @param minMargen Contendra el valor del margen minimo.
	 */
	public void setMinMargen(double minMargen) {
		this.minMargen = minMargen;
	}
	/**
	 * Metodo encargado de devolver el id del producto con el mayor margen de beneficio.
	 * @return idMaxMargen Devolvera el id del producto con el mayor margen de beneficio.
	 */
	public int getIdMaxMargen() {
		return idMaxMargen;
	}
	/**
	 * Metodo encargado de asignar un valor al id del producto con el mayor margen de beneficio.
	 * @param idMaxMargen Contendra el valor id de un producto cuyo margen de beneficio sea el maximo.
	 */
	public void setIdMaxMargen(int idMaxMargen) {
		this.idMaxMargen = idMaxMargen;
	}
	/**
	 * Metodo encargado de devolver el id del producto con el minimo margen de beneficio.
	 * @return idMinMargen Devolvera el id del producto con el minimo margen de beneficio.
	 */
	public int getIdMinMargen() {
		return idMinMargen;
	}
	/**
	 * Metodo encargado de asignar un valor al ide del producto con el minimo margen de beneficio.
	 * @param idMinMargen Contendra el valor id de un producto cuyo margen de beneficio sea el menor.
	 */
	public void setIdMinMargen(int idMinMargen) {
		this.idMinMargen = idMinMargen;
	}
}
