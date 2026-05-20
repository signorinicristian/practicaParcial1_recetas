package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class Premium implements ICriterioDeReceta {
    private Set<String> autoresPreferidos = new HashSet<>();

    public Set<String> getAutoresPreferidos() {
        return autoresPreferidos;
    }

    public Premium(Set<String> autoresPreferidos) {
        this.autoresPreferidos = autoresPreferidos;
    }

    @Override 
    public Boolean leGusta(Receta unaReceta) {
        return this.autoresPreferidos.contains(unaReceta.getAutor());
    }
}
