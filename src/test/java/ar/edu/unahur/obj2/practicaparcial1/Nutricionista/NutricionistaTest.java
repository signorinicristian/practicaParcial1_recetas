package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.ICriterioDeReceta;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class NutricionistaTest {

    private Nutricionista n;

    @BeforeEach
    public void setup() {
        n = Nutricionista.getInstance();
        // limpiar recetas disponibles antes de cada test
        n.getRecetasDisponibles().clear();
    }

    @Test
    public void singletonEsMismoObjeto() {
        Nutricionista n2 = Nutricionista.getInstance();
        assertSame(n, n2);
    }

    @Test
    public void agregarRecetaYListaDisponible() {
        Receta r = new Receta("X", "A", 100, 0);
        n.agregarReceta(r);
        assertTrue(n.getRecetasDisponibles().contains(r));
    }

    @Test
    public void visitarClienteEncuentraRecetaDelCliente() {
        // criterio que acepta solo la receta llamada "Aceptada"
        ICriterioDeReceta criterio = rec -> "Aceptada".equals(rec.getNombre());
        Cliente c = new Cliente(11, criterio);
        Receta buena = new Receta("Aceptada", "P", 1000, 0);
        Receta mala = new Receta("Otra", "Q", 100, 0);
        c.recibirReceta(mala);
        c.recibirReceta(buena);

        Receta encontrada = n.visitarAUnCliente(c);
        assertEquals("Aceptada", encontrada.getNombre());
    }

    @Test
    public void visitarClienteGeneraRecetaDeEmergenciaSiNoHay() {
        ICriterioDeReceta criterio = rec -> false;
        Cliente c = new Cliente(22, criterio);
        Receta resultado = n.visitarAUnCliente(c);
        assertEquals("batido mágico", resultado.getNombre());
    }
}
