package me.gonzager.ex.operaciones;

public class Zona {
    private final Integer tamanio;
    private Integer operaracionesRecibidas = 0;

    public Zona(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public Integer getOperaracionesRecibidas() {
        return operaracionesRecibidas;
    }

    public void setOperaracionesRecibidas(Integer operaracionesRecibidas) {
        this.operaracionesRecibidas = operaracionesRecibidas;
    }

    public void recibirOperacion() {
        this.operaracionesRecibidas++;
    }
}
