package me.gonzager.ex.operaciones.Drones;

public class DronComercial extends Dron{

    public DronComercial(Integer autonomia, Integer procesamiento, me.gonzager.ex.operaciones.Misiones.Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return false;
    }

    @Override
    public Integer eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }
}
