package com.laura.ReproductorDeAudio.principal;

import com.laura.ReproductorDeAudio.modelos.Cancion;
import com.laura.ReproductorDeAudio.modelos.MisFavorito;
import com.laura.ReproductorDeAudio.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Cancion cancionFavorita = new Cancion();
        cancionFavorita.setTitulo("Gracias a Ti");
        cancionFavorita.setAlbum("La revolucion");
        cancionFavorita.setDuracion(4);
        cancionFavorita.setGenero("Balada");
        cancionFavorita.setCantante("Wilsin y Yandel");

        Podcast podcastAprende = new Podcast();
        podcastAprende.setTitulo("Aprendiendo Ingles A");
        podcastAprende.setDescripcion("En este primera temporada aprenderemos las bases del inglés");
        podcastAprende.setDuracion(100);

        //Podcast
        for (int i = 0; i < 100; i++) {
            podcastAprende.meGusta();
        }
        for (int i = 0; i < 400; i++) {
            podcastAprende.reproducir();
        }

        //cancion
        for (int i = 0; i < 9000; i++) {
            cancionFavorita.meGusta();
        }
        for (int i = 0; i < 10000; i++) {
            cancionFavorita.reproducir();
        }

        System.out.println("Total de me gustas: " + podcastAprende.getMeGusta());
        System.out.println("Total de reproducciones " + podcastAprende.getTotalDeReproducciones());

        MisFavorito favorito = new MisFavorito();
        favorito.adiciona(podcastAprende);
    }
}
