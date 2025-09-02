package me.gonzager.ex.operaciones.Misiones;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final boolean mejorasTec;

    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTec) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTec = mejorasTec;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public boolean getMejorasTec() {
        return mejorasTec;
    }

    public Integer eficienciaOperativa() {
        return mejorasTec ? capacidad * 2 : capacidad;
    }

    public Boolean esDuradero() {
        return durabilidad > capacidad * 2;
    }

}
