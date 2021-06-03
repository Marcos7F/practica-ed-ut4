package entity;

/**
 * Clase entidad para los productos generados.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class Producto {
	/**
	 * Precio del producto.
	 */
	private double precio;
	/**
	 * Coste del producto.
	 */
	private double coste;
	/**
	 * Margen de beneficio del producto.
	 */
	private double margen;
	/**
	 * Nuevo precio asignado del producto
	 */
	private double nuevoPrecio;
	/**
	 * Id del producto.
	 */
	private int idProducto;

	/**
	 * Constructor vacio de los productos generados.
	 */
	public Producto(){}
	/**
	 * Constructor de los productos generados.
	 * @param coste Contiene el coste del producto.
	 * @param precio Contiene el precio del producto.
	 */
	public Producto (double coste, double precio){
		this.precio=precio;
		this.coste=coste;
	}
	/**
	 * Metodo encargado de devolver el id del producto.
	 * @return idProducto Devolvera el id del producto.
	 */
	public int getIdProducto() {
		return idProducto;
	}
	/**
	 * Metodo encargado de asignar un id al producto.
	 * @param idProducto Valor id asociado al producto.
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * Metodo encargado de devolver el precio del producto.
	 * @return precio Devolvera el precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Metodo encargado de asignar un precio al producto.
	 * @param precio Valor de precio asociado al producto.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * Metodo encargado de devolver el coste del producto.
	 * @return coste Devolvera el coste asociado al producto.
	 */
	public double getCoste() {
		return coste;
	}
	/**
	 * Metodo encargado de asignar un coste al producto.
	 * @param coste Valor de coste asociado al producto.
	 */
	public void setCoste(double coste) {
		this.coste = coste;
	}
	/**
	 * Metodo encargado de devolver el margen del producto.
	 * @return margen Devolvera el margen de beneficio asociado al producto.
	 */
	public double getMargen() {
		return margen;
	}
	/**
	 * Metodo encargado de asignar un margen del producto.
	 * @param margen Valor del margen de beneficio asociado al producto.
	 */
	public void setMargen(double margen) {
		this.margen = margen;
	}
	/**
	 * Metodo encargado de devolver el nuevo precio del producto.
	 * @return nuevoPrecio Devolvera el nuevo precio asociado al producto.
	 */
	public double getNuevoPrecio() {
		return nuevoPrecio;
	}
	/**
	 * Metodo encargado de asignar un nuevo precio al producto.
	 * @param nuevoPrecio Valor del nuevo precio asociado al producto.
	 */
	public void setNuevoPrecio(double nuevoPrecio) {
		this.nuevoPrecio = nuevoPrecio;
	}
}