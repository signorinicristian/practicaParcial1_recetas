package ar.edu.unahur.obj2.practicaparcial1.Receta;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;

public class Receta extends RecetaBase {
    private String nombre;
    private String autor;
    private Integer valorNutricional;
    private Integer aniosDeTradicion;

    public Receta(String nombre, String autor, Integer valorNutricional, Integer aniosDeTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricional = valorNutricional;
        this.aniosDeTradicion = aniosDeTradicion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public Integer getValorNutricional() {
        return valorNutricional;
    }

    @Override
    public Integer getAniosDeTradicion() {
        return aniosDeTradicion;
    }

    public Boolean esAdecuada(Receta unaRecenta, Cliente unCliente) {
        return unCliente.getCriterio().leGusta(unaRecenta);
    }
}
