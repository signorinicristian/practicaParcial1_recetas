package ar.edu.unahur.obj2.practicaparcial1.Receta;

public abstract class RecetaDecorator extends RecetaBase {
    private RecetaBase recetaEnvuelta;

    public RecetaDecorator(RecetaBase recetaEnvuelta) {
        this.recetaEnvuelta = recetaEnvuelta;
    }

    @Override
    public String getNombre() {
        return recetaEnvuelta.getNombre();
    }

    @Override
    public String getAutor() {
        return recetaEnvuelta.getAutor();
    }

    @Override
    public Integer getValorNutricional() {
        return recetaEnvuelta.getValorNutricional();
    }

    @Override
    public Integer getAniosDeTradicion() {
        return recetaEnvuelta.getAniosDeTradicion();
    }

    @Override
    public Boolean esTradicional() {
        return recetaEnvuelta.esTradicional();
    }
}
