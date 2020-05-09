package com.company;

import java.util.ArrayList;

public class Receta {

    private int id;
    private String nombre;
    private String pais;
    public ArrayList<Ingredientes> ingredientes= new ArrayList<>();


    public Receta(int id, String nombre, String pais, ArrayList<Ingredientes> ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.ingredientes = ingredientes;
    }


    public double precioIngredientes(){
        double sumaIngredientes=0;
        for(int i=0; i < ingredientes.size();i++){
            sumaIngredientes+=ingredientes.get(i).getPrecioUnidad()* ingredientes.get(i).getCantidad();
        }
        return sumaIngredientes;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
