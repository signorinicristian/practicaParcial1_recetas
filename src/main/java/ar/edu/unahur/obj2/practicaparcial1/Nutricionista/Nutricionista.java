package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class Nutricionista {
    private static Nutricionista instancia;
    private final String nombre = "Pepe";

    private final Set<Receta> recetasDisponibles;

    private Nutricionista() {
        this.recetasDisponibles = new HashSet<>();
    }

    public Set<Receta> getRecetasDisponibles() {
        return recetasDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarReceta(Receta unaReceta) {
        recetasDisponibles.add(unaReceta);
    }

    public static Nutricionista getInstance() {
        if (instancia == null) {
            instancia = new Nutricionista();
        }
        return instancia;
    }

    public Receta visitarCliente(Cliente unCliente) {
        Receta receta = unCliente.getRecetasRecibidas().stream()
        .filter(r -> unCliente.getCriterio().leGusta(r))
        .findFirst()
        .orElseGet(() -> new Receta("batido mágico", nombre, 2000, 0));
        return receta;
    }

}
