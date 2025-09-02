package me.gonzager.ex.operaciones;

public class Ciudad {

    private static Ciudad instance = new Ciudad();
    
    public static void setInstance(Ciudad instance) {
        Ciudad.instance = instance;
    }

    private Ciudad() {}
    
    public static Ciudad getInstance() {
        return instance;
    }

    private Integer limiteDronesPorEscuadron = 10;

    public Integer getLimiteDronesPorEscuadron() {
        return limiteDronesPorEscuadron;
    }

    public void setLimiteDronesPorEscuadron(Integer limiteDronesPorEscuadron) {
        this.limiteDronesPorEscuadron = limiteDronesPorEscuadron;
    }
}
