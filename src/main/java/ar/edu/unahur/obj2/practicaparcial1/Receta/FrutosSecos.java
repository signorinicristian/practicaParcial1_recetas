package ar.edu.unahur.obj2.practicaparcial1.Receta;

public class FrutosSecos extends RecetaDecorator {

    public FrutosSecos(RecetaBase recetaEnvuelta) {
        super(recetaEnvuelta);
    }
    
    @Override
    public Integer getValorNutricional() {
        return super.getValorNutricional() + 594;
    }
}
