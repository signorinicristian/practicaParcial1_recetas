package ar.edu.unahur.obj2.practicaparcial1.Ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.Receta.IReceta;

public class RodajasDePalta extends IngredienteDecorator {
    public RodajasDePalta(IReceta recetaEnvuelta) {
        super(recetaEnvuelta);
    }

    @Override
    public Integer getValorNutricionalBase() {
        return super.getValorNutricionalBase() + 160;
    }
}
