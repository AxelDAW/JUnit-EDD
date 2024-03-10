import com.mavenproject.calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author axel
 */


public class CalculadoraTest {
    private Calculadora calculadora;

    // Instanciamos la calculadora con el before
    @Before
    public void instancia() {
        calculadora = new Calculadora();
    }

    // Con el after llamamos a la función restablecer
    @After
    public void funcRest() {
        calculadora.restablecer();
    }

    /**
     * Prueba del método suma.
     */
    @Test
    public void testSuma() {
        assertEquals(5, calculadora.suma(2, 3), 0);
        assertEquals("Suma", calculadora.getLastOp());
        assertEquals(5, calculadora.getLastResult(), 0);
    }

    /**
     * Prueba del método resta.
     */
    @Test
    public void testResta() {
        assertEquals(2, calculadora.resta(5, 3), 0);
        assertEquals("Resta", calculadora.getLastOp());
        assertEquals(2, calculadora.getLastResult(), 0);
    }

    /**
     * Prueba del método multiplica.
     */
    @Test
    public void testMultiplica() {
        assertEquals(6, calculadora.multiplica(2, 3), 0);
        assertEquals("Multiplica", calculadora.getLastOp());
        assertEquals(6, calculadora.getLastResult(), 0);
    }

    /**
     * Prueba del método división.
     */
    @Test
    public void testDivideix() {
        assertEquals(2, calculadora.divideix(6, 3), 0);
        assertEquals("Divideix", calculadora.getLastOp());
        assertEquals(2, calculadora.getLastResult(), 0);
    }

    /**
     * Prueba del método 'majorQue'.
     */
    @Test
    public void testMajorQue() {
        assertTrue(calculadora.majorQue(5, 3));
        assertFalse(calculadora.majorQue(3, 5));
    }
}

