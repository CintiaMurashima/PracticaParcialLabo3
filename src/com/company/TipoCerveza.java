package com.company;

public abstract class TipoCerveza extends Cerveza{

    private boolean gluten;
    private Receta receta;
    private float porcentajeComplejidad;

    public TipoCerveza(String nombre, int id, float precio, float abv, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(nombre, id, precio, abv, descripcion);
        this.gluten = gluten;
        this.receta = receta;
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public float getPorcentajeComplejidad() {
        return porcentajeComplejidad;
    }

    public void setPorcentajeComplejidad(float porcentajeComplejidad) {
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    public void fabricarConSinGluten(Receta receta) {
        gluten = !gluten;
        this.receta =receta;
    }


    @Override
    public double calcularCostoFabricacion() {
        double costo=0;
        costo=getReceta().precioIngredientes();

        if(gluten) {
            costo*= 1.02;
        }
        return costo;
    }

    @Override
    public String toString() {
        return "TipoCerveza{" +
                "gluten=" + gluten +
                ", receta=" + receta +
                ", porcentajeComplejidad=" + porcentajeComplejidad +
                '}';
    }
}
