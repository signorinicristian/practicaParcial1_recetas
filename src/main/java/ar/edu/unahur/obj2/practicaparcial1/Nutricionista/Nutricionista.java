package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class Nutricionista {
    private static final Nutricionista INSTANCE = new Nutricionista();
    private String nombre; 
    private List<Receta> recetasDisponibles = new ArrayList<>();

    private Nutricionista() {}

    public static Nutricionista getInstance() {
        return INSTANCE;
    }

    public void agregarReceta(Receta unaReceta) {
        recetasDisponibles.add(unaReceta);
    }

    public Receta visitarAUnCliente(Cliente unCliente) {
        Receta receta = unCliente.getRecetasRecibidas().stream()
        .filter(r -> r.esAdecuada(r, unCliente))
        .findFirst()
        .orElseGet(() -> new Receta("batido mágico", nombre, 2000, 0));
        return receta;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Receta> getRecetasDisponibles() {
        return recetasDisponibles;
    } 
}
