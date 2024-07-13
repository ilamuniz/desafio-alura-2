package Aplicação;

import models.Musica;
import models.Podcast;

public class Aplicação {

    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Air on the G String");
        musica.setCantor("Johann Sebastian Bach");

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        for (int i = 0; i < 100; i++) {
            musica.reproduzir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Carreira em Java");
        podcast.setTema("Programação e Tecnologia");

        for (int i = 0; i < 250; i++) {
            podcast.curtir();
        }

        for (int i = 0; i < 600; i++) {
            podcast.reproduzir();
        }
    }

}
