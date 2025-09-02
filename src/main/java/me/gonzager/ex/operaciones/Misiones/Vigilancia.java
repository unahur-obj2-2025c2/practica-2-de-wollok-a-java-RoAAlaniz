package me.gonzager.ex.operaciones.Misiones;
import java.util.ArrayList;
import java.util.List;
import me.gonzager.ex.operaciones.Drones.Dron;

public class Vigilancia implements Mision{

    private List <Sensor> sensores = new ArrayList<>();

    public Vigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public Integer extraeEficienciaOperativa() {
        return sensores.stream().mapToInt(s -> s.eficienciaOperativa()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }
}
