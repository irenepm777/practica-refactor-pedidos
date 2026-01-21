package practicarefactorpedidos;

import java.util.ArrayList;

/**
 * Código inicial para la práctica de refactorización.
 * Criterios: Nombres genéricos, números mágicos y métodos con demasiadas responsabilidades.
 */

public class ProcesadorPedidos {
 
 
    private static final double GASTOS_ENVIO = 15.95;
	private static final double PORCENTAJE_DESCUENTO = 0.10;
	private static final double IVA = 0.21;

	public double procesar(ArrayList<String> nombresProductos, ArrayList<Double> preciosProductos) {
        double totalSinImpuestos = 0;
        
        // Sumar precios de la lista
        for (int i = 0; i < preciosProductos.size(); i++) {
            System.out.println("Añadiendo producto: " + nombresProductos.get(i));
            totalSinImpuestos = totalSinImpuestos + preciosProductos.get(i);
        }
        
        // Lógica de descuento (Magic Number 100 y 0.10)
        if (totalSinImpuestos > 100) {
            System.out.println("Descuento aplicado.");
            totalSinImpuestos = totalSinImpuestos - (totalSinImpuestos * PORCENTAJE_DESCUENTO); 
        }
        
        // Cálculo de impuestos (Magic Number 0.21)
        double totalFinal = calcularTotalConIVA(totalSinImpuestos);
        
        // Gastos de envío (Magic Number 500 y 15.95)
        totalFinal = aplicarGastosEnvio(totalFinal);
        
        return totalFinal;
    }

	private double aplicarGastosEnvio(double totalFinal) {
		if (totalFinal < 500) {
            totalFinal = totalFinal + GASTOS_ENVIO;
        }
		return totalFinal;
	}

	private double calcularTotalConIVA(double totalSinImpuestos) {
		double totalFinal = totalSinImpuestos + (totalSinImpuestos * IVA);
		return totalFinal;
	}
}