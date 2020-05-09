package com.company;

import java.util.ArrayList;

public class Fabrica {

    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Cerveza> cervezas=new ArrayList<>();


    public Fabrica(int id, String nombre, String direccion, ArrayList<Cerveza> cervezas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cervezas = cervezas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cerveza> getCervezas() {
        return cervezas;
    }

    public void setCervezas(ArrayList<Cerveza> cervezas) {
        this.cervezas = cervezas;
    }

    public void listarCerveza(){
           for(int i=0; i< cervezas.size();i++)
               System.out.println(cervezas.get(i).toString());
        }

    public void agregarCerveza(Cerveza cerveza) {
        boolean encontrada=buscarCervezaNombre(cerveza);
        if (!encontrada) {
            cervezas.add(cerveza);
        }
    }

    public boolean buscarCervezaNombre(Cerveza cerveza){
        boolean encontrada= false;
        for (int i = 0; i < cervezas.size(); i++) {
            if(cervezas.get(i).getNombre().equals(cerveza.getNombre()))
            {
                encontrada=true;
            }
        }
        return encontrada;
    }


    public void eliminarCerveza(Cerveza cerveza){
        cervezas.remove(cerveza);
    }


    @Override
    public String toString() {
        return "Fabrica{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cervezas=" + cervezas +
                '}';
    }

}


