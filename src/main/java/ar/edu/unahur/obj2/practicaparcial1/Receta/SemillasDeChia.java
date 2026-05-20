package ar.edu.unahur.obj2.practicaparcial1.Receta;

public class SemillasDeChia extends RecetaDecorator {

    public SemillasDeChia(RecetaBase recetaEnvuelta) {
        super(recetaEnvuelta);
    }

    @Override
    public Integer getValorNutricional() {
        return super.getValorNutricional() + 490;
    }
    
}
