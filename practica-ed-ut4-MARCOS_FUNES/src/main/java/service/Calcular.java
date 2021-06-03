package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Clase encargada de realizar las operaciones basicas del proyecto.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class Calcular {
	/**
	 * Metodo que genera numeros aleatorios para los valores necesarios de los productos.
	 * @param random Valor maximo del que generar numeros aleatorios.
	 * @return Devolvera un numero aleatorio.
	 */
	public double generaNumeroRandom(int random) {
		return BigDecimal.valueOf(Math.random() * random).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	/**
	 * Metodo que calcula y devuelve el margen.
	 * @param precio Contiene el valor de un precio de un producto.
	 * @param coste Contiene el valor del coste de un producto.
	 * @return Devolvera el margen calculado.
	 */
	public double calculaMargen(double precio, double coste) {
		return BigDecimal.valueOf(((precio - coste) / precio) * 100).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	/**
	 * Metodo que calcula y devuelve el beneficio total calculado.
	 * @param resultado Variable que contiene la suma del beneficio total anterior.
	 * @param precio Contiene el valor de un precio de un producto.
	 * @param coste Contiene el valor del coste de un producto.
	 * @return Devolvera el beneficio total calculado.
	 */
	public double calcularBeneficioTotal(double resultado, double precio, double coste) {
		return BigDecimal.valueOf(resultado + (precio - coste))
				.setScale(2, RoundingMode.HALF_UP).doubleValue();
	} 
	/**
	 * Metodo que calcula el nuevo precio de un producto a partir de su coste.
	 * @param coste Contiene el valor del coste de un producto.
	 * @return Devolvera el nuevo precio asignado al producto.
	 */
	public double calcularNuevoPrecio(double coste) {
		return BigDecimal.valueOf((coste / (1 - (10.00 / 100))))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
