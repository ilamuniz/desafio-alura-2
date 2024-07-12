package models;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }
}
