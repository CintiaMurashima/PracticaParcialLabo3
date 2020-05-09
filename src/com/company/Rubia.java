package com.company;

public class Rubia extends TipoCerveza {

    public Rubia(String nombre, int id, float precio, float abv, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(nombre, id, precio, abv, descripcion, gluten, receta, porcentajeComplejidad);
    }

    @Override
    public double calcularCostoFabricacion() {
        return super.calcularCostoFabricacion()*1.1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
