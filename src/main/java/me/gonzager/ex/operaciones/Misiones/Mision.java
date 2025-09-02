package me.gonzager.ex.operaciones.Misiones;
import me.gonzager.ex.operaciones.Drones.Dron;

public interface Mision {
    Integer extraeEficienciaOperativa();
    Boolean esAvanzadoSegunMision(Dron dron);


}
