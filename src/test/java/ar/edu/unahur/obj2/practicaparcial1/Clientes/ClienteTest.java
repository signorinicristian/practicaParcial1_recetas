package ar.edu.unahur.obj2.practicaparcial1.Clientes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.CriteriosDeReceta.ICriterioDeReceta;
import ar.edu.unahur.obj2.practicaparcial1.Receta.Receta;

public class ClienteTest {

    @Test
    public void recibirYSumarValorNutricional() {
        ICriterioDeReceta criterio = unaReceta -> true;
        Cliente c = new Cliente(999, criterio);
        Receta r1 = new Receta("A", "X", 100, 0);
        Receta r2 = new Receta("B", "Y", 150, 0);
        c.recibirReceta(r1);
        c.recibirReceta(r2);

        assertEquals(250, c.valorTotalNutricional());

        RecetasConValorNutricional dto = c.listaDeRecetasConValorNutricional();
        List<Receta> lista = dto.getRecetas();
        assertEquals(2, lista.size());
        assertEquals(Integer.valueOf(250), dto.getValorTotal());
    }
}
