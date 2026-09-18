/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.peliculas.domain;
public class Podcast {
    private String titulo;
    private String autor;
    private int cantidadEpisodios;

    public Podcast() {
    }

    public Podcast(String titulo, String autor, int cantidadEpisodios) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidadEpisodios=" + cantidadEpisodios +
                '}';
    }
}
