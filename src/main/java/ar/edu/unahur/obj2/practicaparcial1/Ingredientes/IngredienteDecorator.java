package ar.edu.unahur.obj2.practicaparcial1.Ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.Receta.IReceta;

public abstract class IngredienteDecorator implements IReceta {
    protected IReceta recetaEnvuelta;


    public IngredienteDecorator(IReceta recetaEnvuelta) {
        this.recetaEnvuelta = recetaEnvuelta;
    }

    @Override
    public Boolean esTradicional() {
        return recetaEnvuelta.esTradicional();
    }

    @Override
    public String getAutor() {
        return recetaEnvuelta.getAutor();
    }

    @Override
    public Integer getAñosDeTradicion() {
        return recetaEnvuelta.getAñosDeTradicion();
    }

    @Override
    public String getNombre() {
        return recetaEnvuelta.getNombre();
    }

    @Override
    public Integer getValorNutricionalBase() {
        return recetaEnvuelta.getValorNutricionalBase();
    }
}
