package ar.edu.unahur.obj2.practicaparcial1.Ingredientes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class IngredientesTest {

    @Test
    void frutosSecosDeberiaAumentarElValorNutricionalYConservarElRestoDeLosDatos() {
        Receta recetaBase = new Receta("Ensalada", "Pepe", 120, 5);
        FrutosSecos ingrediente = new FrutosSecos(recetaBase);

        assertEquals("Ensalada", ingrediente.getNombre());
        assertEquals("Pepe", ingrediente.getAutor());
        assertEquals(5, ingrediente.getAñosDeTradicion());
        assertEquals(714, ingrediente.getValorNutricionalBase());
        assertEquals(false, ingrediente.esTradicional());
    }

    @Test
    void rodajasDePaltaDeberiaAumentarElValorNutricionalYConservarElRestoDeLosDatos() {
        Receta recetaBase = new Receta("Ensalada", "Pepe", 120, 20);
        RodajasDePalta ingrediente = new RodajasDePalta(recetaBase);

        assertEquals("Ensalada", ingrediente.getNombre());
        assertEquals("Pepe", ingrediente.getAutor());
        assertEquals(20, ingrediente.getAñosDeTradicion());
        assertEquals(280, ingrediente.getValorNutricionalBase());
        assertEquals(true, ingrediente.esTradicional());
    }

    @Test
    void semillasDeChiaDeberiaAumentarElValorNutricionalYConservarElRestoDeLosDatos() {
        Receta recetaBase = new Receta("Ensalada", "Pepe", 120, 5);
        RodajasDePalta ingrediente = new RodajasDePalta(new SemillasDeChia(recetaBase));

        assertEquals("Ensalada", ingrediente.getNombre());
        assertEquals("Pepe", ingrediente.getAutor());
        assertEquals(5, ingrediente.getAñosDeTradicion());
        assertEquals(770, ingrediente.getValorNutricionalBase());
        assertEquals(false, ingrediente.esTradicional());
    }
}