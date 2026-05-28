package ar.edu.unahur.obj2.practicaparcial1.Receta;

public interface IReceta {
    String getNombre();
    String getAutor();
    Integer getValorNutricionalBase();
    Integer getAñosDeTradicion();
    Boolean esTradicional();
}
