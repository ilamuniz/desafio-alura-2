package models;

public class Favoritos {

    public void favoritar(Audio audio) {
        if (audio.getClassificacao() == 10) {
            System.out.println(audio.getTitulo() + " é um dos mais tocados e o favorito do usuário.");
        } else {
            System.out.println("Adicione " + audio.getTitulo() + " para ouvir mais tarde.");
        }
    }

}
