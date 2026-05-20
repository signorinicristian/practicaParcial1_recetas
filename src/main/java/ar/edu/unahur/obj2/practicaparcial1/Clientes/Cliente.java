package ar.edu.unahur.obj2.practicaparcial1.Clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.ICriterioDeReceta;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class Cliente {
    private final Integer dni;
    private ICriterioDeReceta criterio;
    private List<Receta> recetasRecibidas = new ArrayList<>();

    public Cliente(Integer dni, ICriterioDeReceta criterio) {
        this.dni = dni;
        this.criterio = criterio;
    }

    public Integer getDni() {
        return dni;
    }

    public ICriterioDeReceta getCriterio() {
        return criterio;
    }

    public void setCriterio(ICriterioDeReceta criterio) {
        this.criterio = criterio;
    }

    public List<Receta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public void recibirReceta(Receta unaReceta) {
        recetasRecibidas.add(unaReceta);
    }

    public Integer valorTotalNutricional() {
        return recetasRecibidas.stream()
            .mapToInt(r -> r.getValorNutricional())
            .sum();
    }

    public RecetasConValorNutricional listaDeRecetasConValorNutricional() {
        return new RecetasConValorNutricional(this.getRecetasRecibidas(), this.valorTotalNutricional());
    }
}
