/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.peliculas.domain;
public class ProgramaTV {
    private String nombre;
    private String canal;
    private int duracionMinutos;

    public ProgramaTV() {
    }

    public ProgramaTV(String nombre, String canal, int duracionMinutos) {
        this.nombre = nombre;
        this.canal = canal;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "ProgramaTV{" +
                "nombre='" + nombre + '\'' +
                ", canal='" + canal + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }
}
