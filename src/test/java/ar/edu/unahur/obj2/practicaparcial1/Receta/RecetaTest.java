package ar.edu.unahur.obj2.practicaparcial1.Receta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.ComeTutti;

public class RecetaTest {

    @Test
    public void gettersYTradicional() {
        Receta r = new Receta("Tarta", "Ana", 500, 25);
        assertEquals("Tarta", r.getNombre());
        assertEquals("Ana", r.getAutor());
        assertEquals(500, r.getValorNutricional());
        assertEquals(25, r.getAniosDeTradicion());
        assertTrue(r.esTradicional());
    }

    @Test
    public void noEsTradicional() {
        Receta r = new Receta("Ensalada", "Luis", 200, 5);
        assertFalse(r.esTradicional());
    }

    @Test
    public void esAdecuadaUsandoCriterioDelCliente() {
        Receta r = new Receta("Pizza", "Marta", 800, 2);
        Cliente c = new Cliente(123, new ComeTutti());
        assertTrue(r.esAdecuada(r, c));
    }
}
