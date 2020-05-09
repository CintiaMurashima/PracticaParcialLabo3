package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        System.out.println("---------------Eje 1-------------------");

        Ingredientes ingredientes= new Ingredientes(123,"malta","Argentina",1,10);
        Ingredientes ingredientes1= new Ingredientes(124,"cebada","suecia",2,26);
        Ingredientes ingredientes2= new Ingredientes(125,"trigo","holanda",1,15);
        Ingredientes ingredientes3= new Ingredientes(126,"agua","media",1,5);
        Ingredientes ingredientes4= new Ingredientes(127,"lupulo","buena",2,20);

        ArrayList<Ingredientes> listaIngredientes= new ArrayList<>();
        listaIngredientes.add(ingredientes);
        listaIngredientes.add(ingredientes1);
        listaIngredientes.add(ingredientes4);
        listaIngredientes.add(ingredientes4);

        System.out.println(listaIngredientes);

        System.out.println("---------------Eje 2-------------------");


        Receta receta= new Receta(1,"Ipa","Argentina",listaIngredientes);
        System.out.println(receta);
        Receta receta1= new Receta(2,"Blond","Argentina",listaIngredientes);
        System.out.println(receta1);
        Receta receta2= new Receta(3,"Barley Wine","Argentina",listaIngredientes);
        System.out.println(receta2);
        Receta receta3= new Receta(4,"Porter","Argentina",listaIngredientes);
        System.out.println(receta3);
        Receta receta4= new Receta(5,"Amber","Argentina",listaIngredientes);
        System.out.println(receta4);

        System.out.println("---------------Eje 3-------------------");

        Roja cervezaRoja= new Roja("Amber", 1,200,2,"buena",true,receta4,15);
        System.out.println("CERVEZA ROJA= " + cervezaRoja + "COSTO FABRICACION " +  cervezaRoja.calcularCostoFabricacion());

        Negra cervezaNegra=new Negra("Porter", 2,200,8," muy buena",true,receta3,20);
        System.out.println("CERVEZA NEGRA= " + cervezaNegra + "COSTO FABRICACION " +  cervezaNegra.calcularCostoFabricacion());

        Rubia cervezaRubia= new Rubia("Blond", 3,200,7,"excelente",true,receta1,10);
        System.out.println("CERVEZA RUBIA= " + cervezaRubia + "COSTO FABRICACION " +  cervezaRubia.calcularCostoFabricacion());



        System.out.println("---------------Eje 4-------------------");

        ArrayList<Cerveza> cerveza= new ArrayList<>();
        cerveza.add(cervezaNegra);
        cerveza.add(cervezaRoja);
        cerveza.add(cervezaRubia);

        Fabrica fabrica= new Fabrica(1,"Barley","A la vuelta",cerveza);
        System.out.println(fabrica);
        fabrica.listarCerveza();


        System.out.println("---------------LISTAR CERVEZA LUEGO DE ELIMINAR NEGRA------------------");
        fabrica.eliminarCerveza(cervezaNegra);
        fabrica.listarCerveza();

        System.out.println("---------------LISTAR CERVEZA LUEGO DE AGREGAR NEGRA-----------------");

        fabrica.agregarCerveza(cervezaNegra);
        fabrica.listarCerveza();


        System.out.println("---------------MUESTRA CON GLUTEN Y LUEGO SIN GLUTEN-------------------");


        System.out.println(cervezaNegra + "PRECIO" + cervezaNegra.calcularCostoFabricacion());
        cervezaNegra.fabricarConSinGluten(receta3);
        System.out.println(cervezaNegra + "PRECIO" + cervezaNegra.calcularCostoFabricacion());




    }
}
