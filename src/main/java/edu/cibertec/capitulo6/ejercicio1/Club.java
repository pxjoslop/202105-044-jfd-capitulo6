package edu.cibertec.capitulo6.ejercicio1;

public enum Club {
    REAL_MADRID(1, "Real Madrid"),
    BARCELONA(2, "FC Barcelona"),
    SEVILLA(3, "FC Sevilla"),
    RAYO_VALLECANO(4, "Deportes Rayo Vallecano");
    
    private String nombreClub;
    private int codigo;

    private Club(int codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombreClub = nombre;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public int getCodigo() {
        return codigo;
    }
}
