package ar.edu.unahur.obj2.practicaparcial1.Ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.Receta.IReceta;

public class FrutosSecos extends IngredienteDecorator {

    public FrutosSecos(IReceta recetaEnvuelta) {
        super(recetaEnvuelta);
    }

    @Override
    public Integer getValorNutricionalBase() {
        return super.getValorNutricionalBase() + 594;
    }

}
