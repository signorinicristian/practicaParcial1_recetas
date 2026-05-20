package ar.edu.unahur.obj2.practicaparcial1.Receta;

public class RodajasDePalta extends RecetaDecorator {

    public RodajasDePalta(RecetaBase recetaEnvuelta) {
        super(recetaEnvuelta);
    }

    @Override
    public Integer getValorNutricional() {
        return super.getValorNutricional() + 160;
    }

}
