package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class RecetaTradicional implements ICriterioDeReceta {
    @Override
    public Boolean leGusta(Receta unaReceta) {
        return unaReceta.esTradicional();
    }
}
