package com.laura.ReproductorDeAudio.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void meGusta() {
        this.meGusta++;
    }

    public void reproducir() {
        this.totalDeReproducciones++;
    }
}
