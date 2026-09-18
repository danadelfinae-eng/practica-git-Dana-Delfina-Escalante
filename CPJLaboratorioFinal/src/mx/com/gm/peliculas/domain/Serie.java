/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.peliculas.domain;
public class Serie {
    private String titulo;
    private int temporadas;
    private int cantidadEpisodios;

    public Serie() {
    }

    public Serie(String titulo, int temporadas, int cantidadEpisodios) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", cantidadEpisodios=" + cantidadEpisodios +
                '}';
    }
}
