package practicarefactorpedidos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ProcesadorPedidosTest {

    private static final double RESULTADO_ESPERADO = 233.75;
    private static final double DELTA = 0.01;

    @Test
    public void testProcesarPedidoConDescuento() {
        ProcesadorPedidos proc = new ProcesadorPedidos();
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Monitor", "Teclado"));
        ArrayList<Double> precios = new ArrayList<>(Arrays.asList(150.0, 50.0));

        double resultado = proc.procesar(nombres, precios);

        assertEquals(RESULTADO_ESPERADO, resultado, DELTA);
    }
}
