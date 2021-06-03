package main;

import entity.Tienda;
import service.MostrarValores;
import service.Service;
import service.TiendaBuilder;

/**
 * Clase principal del proyecto.
 * @version 1.0
 * @author Marcos Funes Arribas
 * @since 03/06/2021
 */
public class Principal {
/**
 * Metodo principal encargado de comenzar el proyecto.
 * @param args es un arreglo con los parámetros que el reciba por consola.
 */
    public static void main(String[] args) {
    TiendaBuilder builder=new TiendaBuilder();
    Tienda tienda = builder.construirTienda();
    Service principal=new Service();
    
            // Operaciones
    
            // 1. Calcula Margen de beneficio
            principal.calculaMargenBenef(tienda);
            
            // 2. Obtener el id del producto con mayor margen de beneficio
            tienda.setIdMaxMargen(principal.calcularIdMaximo(tienda));
            
            // 3. Obtener el id del producto con menor margen de beneficio
            tienda.setIdMinMargen(principal.calcularIdMin(tienda));
            
            // 4. Calcular el precio del producto para todos aquellos productos 
            // que no tengan al menos un margen del 10%
            principal.calcularNuevoPrecioProduct(tienda);
    		
            // 5. Beneficio total
            principal.benefTotal(tienda); 
    		
            MostrarValores menu=new MostrarValores();
            
            menu.mostrarPrecios(tienda);
            menu.mostrarCostes(tienda);
            menu.mostrarMargen(tienda);
            menu.mostrarNuevoPrecio(tienda);
            
            System.out.println("Id producto margen maximo: " + tienda.getIdMaxMargen());
            System.out.println("Id producto margen minimo: " + tienda.getIdMinMargen());
            System.out.println("Margen Maximo: " + tienda.getMaxMargen());
            System.out.println("Margen Minimo: " + tienda.getMinMargen());
            System.out.println("Beneficio total: " + tienda.getBeneficioTotal());
    	} 
    }