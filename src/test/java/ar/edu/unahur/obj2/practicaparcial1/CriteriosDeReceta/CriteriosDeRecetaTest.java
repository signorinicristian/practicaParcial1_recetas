package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class CriteriosDeRecetaTest {

    @Test
    void comeTuttiDeberiaAceptarCualquierReceta() {
        ComeTutti criterio = new ComeTutti();

        assertTrue(criterio.leGusta(new Receta("Ensalada", "Pepe", 120, 5)));
        assertTrue(criterio.leGusta(new Receta("Batido", "Otro", 0, 0)));
    }

    @Test
    void altoValorNutricionalDeberiaAceptarSoloRecetasConCaloriasSuficientes() {
        AltoValorNutricional criterio = new AltoValorNutricional(100);

        assertTrue(criterio.leGusta(new Receta("Ensalada", "Pepe", 120, 5)));
        assertFalse(criterio.leGusta(new Receta("Fruta", "Pepe", 99, 5)));
        assertTrue(criterio.getCaloriasMinimas().equals(100));
    }

    @Test
    void premiumDeberiaAceptarSoloAutoresPreferidos() {
        Set<String> autoresPreferidos = new HashSet<>();
        autoresPreferidos.add("Pepe");
        Premium criterio = new Premium(autoresPreferidos);

        assertTrue(criterio.leGusta(new Receta("Ensalada", "Pepe", 120, 5)));
        assertFalse(criterio.leGusta(new Receta("Fruta", "Otro", 120, 5)));
    }

    @Test
    void recetasTradicionalesDeberiaAceptarSoloRecetasTradicionales() {
        RecetasTradicionales criterio = new RecetasTradicionales();

        assertTrue(criterio.leGusta(new Receta("Antigua", "Pepe", 120, 20)));
        assertFalse(criterio.leGusta(new Receta("Nueva", "Pepe", 120, 19)));
    }
}