package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class RecetasTradicionales implements ICriterio {

    @Override
    public Boolean leGusta(Receta unaReceta) {
        return Boolean.valueOf(unaReceta.esTradicional());
    }
    
}
