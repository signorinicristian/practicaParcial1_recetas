package ar.edu.unahur.obj2.practicaparcial1.Receta;

public abstract class RecetaBase {
    public abstract String getNombre();
    public abstract String getAutor();
    public abstract Integer getValorNutricional();
    public abstract Integer getAniosDeTradicion();

    public Boolean esTradicional() {
        return getAniosDeTradicion() >= 20;
    }
}