package me.gonzager.ex.operaciones;
import java.util.HashSet;
import java.util.Set;
import me.gonzager.ex.operaciones.Drones.Dron;

public class Escuadron {
    
    private Set<Dron> drones = new HashSet<>();

    public void agregarDron(Dron dron) throws Exception {
        if (drones.size() >= Ciudad.getInstance().getLimiteDronesPorEscuadron()) {
            throw new Exception("No se pueden agregar más drones al escuadrón");
        } 
        drones.add(dron);
    }

    private Boolean alMenosUnDronEsAvanzado() {
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }

    public Boolean puedeOperarEn(Zona zona){
        return this.alMenosUnDronEsAvanzado() && this.eficienciaOperativa() > zona.getTamanio() * 2;
    }

    private Integer eficienciaOperativa() {
        return drones.stream().mapToInt(d -> d.eficienciaOperativa()).sum();
    }

    public Set<Dron> getDrones() {
        return drones;
    }

    public void setDrones(Set<Dron> drones) {
        this.drones = drones;
    }

    public void operar(Zona zona){
        if (this.puedeOperarEn(zona)){
            zona.recibirOperacion();
            drones.stream().forEach(d -> d.disminuirAutonomia());
        }
    }
}
