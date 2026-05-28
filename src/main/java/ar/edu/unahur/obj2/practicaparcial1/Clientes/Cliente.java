package ar.edu.unahur.obj2.practicaparcial1.Clientes;

import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.ICriterio;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class Cliente {
    private final Integer dni;
    private ICriterio criterio;
    private Set<Receta> recetasRecibidas = new HashSet<>();
    
    public Cliente(Integer dni, ICriterio criterio) {
        this.dni = dni;
        this.criterio = criterio;
    }

    public Integer getDni() {
        return dni;
    }

    public ICriterio getCriterio() {
        return criterio;
    }

    public void setCriterio(ICriterio criterio) {
        this.criterio = criterio;
    }

    public void recibirReceta(Receta unaReceta) {
        recetasRecibidas.add(unaReceta);
    }

    public Set<Receta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public Set<Integer> getValorDeCadaReceta() {
        return recetasRecibidas.stream()
                .map(r -> r.getValorNutricionalBase())
                .collect(Collectors.toSet());
    }
     
}
