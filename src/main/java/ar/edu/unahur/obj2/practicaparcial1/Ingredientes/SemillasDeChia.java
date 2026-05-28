package ar.edu.unahur.obj2.practicaparcial1.Ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class SemillasDeChia extends IngredienteDecorator {
    public SemillasDeChia(Receta recetaEnvuelta) {
        super(recetaEnvuelta);
    }

    @Override
    public Integer getValorNutricionalBase() {
        return super.getValorNutricionalBase() + 490;
    }
}
