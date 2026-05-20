package ar.edu.unahur.obj2.practicaparcial1.Receta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RecetaDecoratorTest {

    private static class TestDecorator extends RecetaDecorator {
        public TestDecorator(RecetaBase base) {
            super(base);
        }
    }

    @Test
    public void delegaTodosLosMetodos() {
        Receta base = new Receta("Base","Autor",300,10);
        TestDecorator d = new TestDecorator(base);
        assertEquals(base.getNombre(), d.getNombre());
        assertEquals(base.getAutor(), d.getAutor());
        assertEquals(base.getValorNutricional(), d.getValorNutricional());
        assertEquals(base.getAniosDeTradicion(), d.getAniosDeTradicion());
        assertEquals(base.esTradicional(), d.esTradicional());
    }
}
