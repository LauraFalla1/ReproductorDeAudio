package com.laura.ReproductorDeAudio.modelos;

public class MisFavorito {
    public void adiciona( Audio audio ){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos");
        } else {
            System.out.println(audio.getTitulo() + " se encuentra en la lista de favoritos");
        }
    }
}
