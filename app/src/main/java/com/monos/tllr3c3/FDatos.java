package com.monos.tllr3c3;

public class FDatos {

    String titulo;
    int imagen;
    int estado;

    public FDatos(String titulo, int imagen, int estado) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
