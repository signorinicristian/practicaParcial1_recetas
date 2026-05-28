package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.AltoValorNutricional;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class NutricionistaTest {

    @BeforeEach
    void resetSingleton() throws Exception {
        Field instancia = Nutricionista.class.getDeclaredField("instancia");
        instancia.setAccessible(true);
        instancia.set(null, null);
    }

    @Test
    void deberiaRetornarSiempreLaMismaInstancia() {
        Nutricionista primeraInstancia = Nutricionista.getInstance();
        Nutricionista segundaInstancia = Nutricionista.getInstance();

        assertSame(primeraInstancia, segundaInstancia);
    }

    @Test
    void deberiaCompartirElEstadoDeLaInstanciaSingleton() {
        Nutricionista nutricionista = Nutricionista.getInstance();
        Receta receta = new Receta("Ensalada", "Pepe", 120, 5);

        nutricionista.agregarReceta(receta);

        Nutricionista mismaInstancia = Nutricionista.getInstance();

        assertSame(nutricionista, mismaInstancia);
        assertEquals(1, mismaInstancia.getRecetasDisponibles().size());
        assertTrue(mismaInstancia.getRecetasDisponibles().contains(receta));
    }

    @Test
    void deberiaTenerElNombreDelNutricionista() {
        assertEquals("Pepe", Nutricionista.getInstance().getNombre());
    }

    @Test
    void deberiaDevolverLaRecetaAdecuadaDelCliente() {
        Nutricionista nutricionista = Nutricionista.getInstance();
        Cliente cliente = new Cliente(123, new AltoValorNutricional(100));
        Receta recetaAdecuada = new Receta("Ensalada", "Pepe", 120, 5);

        cliente.recibirReceta(recetaAdecuada);

        Receta recetaSeleccionada = nutricionista.visitarCliente(cliente);

        assertSame(recetaAdecuada, recetaSeleccionada);
        assertEquals("Ensalada", recetaSeleccionada.getNombre());
        assertEquals("Pepe", recetaSeleccionada.getAutor());
        assertEquals(120, recetaSeleccionada.getValorNutricionalBase());
        assertEquals(5, recetaSeleccionada.getAñosDeTradicion());
    }
}