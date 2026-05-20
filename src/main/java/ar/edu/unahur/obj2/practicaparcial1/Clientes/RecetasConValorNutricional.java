package ar.edu.unahur.obj2.practicaparcial1.Clientes;

import java.util.List;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class RecetasConValorNutricional {
    private final List<Receta> recetas;
    private final Integer valorTotal;

    public RecetasConValorNutricional(List<Receta> recetas, Integer valorTotal) {
        this.recetas = recetas;
        this.valorTotal = valorTotal;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    
}
