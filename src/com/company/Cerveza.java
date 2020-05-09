package com.company;

import java.util.Objects;

public abstract class Cerveza {

    String nombre;
    private int id;
    private float precio;
    private float abv;
    private String descripcion;

    public Cerveza(String nombre, int id, float precio, float abv, String descripcion) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.abv = abv;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double calcularCostoFabricacion();

    @Override
    public String toString() {
        return "Cerveza{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", precio=" + precio +
                ", abv=" + abv +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Cerveza cerveza = (Cerveza) o;
        return id == cerveza.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
