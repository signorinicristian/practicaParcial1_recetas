package ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class CriteriosTest {

    @Test
    public void comeTuttiSiempreTrue() {
        ComeTutti ct = new ComeTutti();
        Receta r = new Receta("X","A",100,0);
        assertTrue(ct.leGusta(r));
    }

    @Test
    public void altoValorNutricional() {
        AltoValorNutricional av = new AltoValorNutricional(500);
        Receta buena = new Receta("B","A",600,0);
        Receta mala = new Receta("C","A",100,0);
        assertTrue(av.leGusta(buena));
        assertFalse(av.leGusta(mala));
    }

    @Test
    public void premiumPorAutor() {
        Set<String> set = new HashSet<>();
        set.add("Preferido");
        Premium p = new Premium(set);
        Receta ok = new Receta("X","Preferido",100,0);
        Receta no = new Receta("Y","Otro",100,0);
        assertTrue(p.leGusta(ok));
        assertFalse(p.leGusta(no));
    }

    @Test
    public void recetaTradicionalUsaEsTradicional() {
        Receta t = new Receta("T","A",100,30);
        RecetaTradicional rt = new RecetaTradicional();
        assertTrue(rt.leGusta(t));
    }
}
