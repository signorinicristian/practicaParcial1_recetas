package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class AltoValorNutricional implements ICriterio {
    private Integer caloriasMinimas;
    
    public Integer getCaloriasMinimas() {
        return caloriasMinimas;
    }

    public AltoValorNutricional(Integer calorias) {
        this.caloriasMinimas = calorias;
    }

    @Override
    public Boolean leGusta(Receta unaReceta) {
        return Boolean.valueOf(unaReceta.getValorNutricionalBase() >= caloriasMinimas);
    }
    
}
