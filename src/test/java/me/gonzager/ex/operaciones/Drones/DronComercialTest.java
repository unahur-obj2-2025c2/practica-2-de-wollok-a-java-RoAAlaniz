package me.gonzager.ex.operaciones.Drones;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import me.gonzager.ex.operaciones.Misiones.Transporte;

public class DronComercialTest {

    Dron dron1 = new DronComercial(60, 100, Transporte.getInstance());

    @Test
    void testEficienciaOperativaDeUnDronComercial() {
        assertEquals(60*10+100, dron1.eficienciaOperativa());
    }

    @Test
    void testEsAvanzadoSegunTipoDeUnDronComercial() {
        assertFalse(dron1.esAvanzadoSegunTipo());
    }
}
