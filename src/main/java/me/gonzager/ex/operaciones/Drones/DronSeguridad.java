package me.gonzager.ex.operaciones.Drones;
import me.gonzager.ex.operaciones.Misiones.Mision;

public class DronSeguridad extends Dron{
    public DronSeguridad(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return this.procesamiento > 50;
    }
}
