package ar.edu.unahur.obj2.practicaparcial1.Receta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.ICriterioDeReceta;

public class RecetaAdditionalTest {

    @Test
    public void esTradicionalConAniosIgualA20() {
        Receta r = new Receta("Clasica","Viejo",100,20);
        assertTrue(r.esTradicional());
    }

    @Test
    public void esAdecuadaDevuelveFalseCuandoCriterioDevuelveFalse() {
        Receta r = new Receta("Moderna","Autor",300,1);
        ICriterioDeReceta criterioFalse = rec -> false;
        Cliente c = new Cliente(1, criterioFalse);
        assertFalse(r.esAdecuada(r, c));
    }

    @Test
    public void gettersAceptanNulls() {
        Receta r = new Receta(null, null, null, 0);
        assertNull(r.getNombre());
        assertNull(r.getAutor());
        assertNull(r.getValorNutricional());
        assertEquals(Integer.valueOf(0), r.getAniosDeTradicion());
    }
}
