package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class AltoValorNutricional implements ICriterioDeReceta {
    private Integer cantMinimaCalorias;

    public Integer getCantMinimaCalorias() {
        return cantMinimaCalorias;
    }

    public AltoValorNutricional(Integer cantMinimaCalorias) {
        this.cantMinimaCalorias = cantMinimaCalorias;
    }
    
    @Override
    public Boolean leGusta(Receta unaReceta) {
        return unaReceta.getValorNutricional() >= this.cantMinimaCalorias;
    }
}
