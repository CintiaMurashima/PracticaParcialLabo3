package com.company;

public class Roja extends TipoCerveza {

    public Roja(String nombre, int id, float precio, float abv, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(nombre, id, precio, abv, descripcion, gluten, receta, porcentajeComplejidad);
    }

    @Override
    public double calcularCostoFabricacion() {
        return super.calcularCostoFabricacion()* 1.15;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
