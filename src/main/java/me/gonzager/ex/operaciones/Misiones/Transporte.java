package me.gonzager.ex.operaciones.Misiones;
import me.gonzager.ex.operaciones.Drones.Dron;

public class Transporte implements Mision{
    private static final Transporte instance = new Transporte();
    
    private Transporte() {};
    
    public static Transporte getInstance() {
        return instance;
    }

    @Override
    public Integer extraeEficienciaOperativa() {
        return 100;
    }
    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
