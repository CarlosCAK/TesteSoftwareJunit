import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSoma(){
            // Esperamos que a soma de 2 + 3 seja 5

        Calculadora calc = new Calculadora();

        assertEquals(5,calc.soma(2,3));
        assertEquals(10,calc.soma(5,5));
        assertEquals(0,calc.soma(0,0));
        assertEquals(-1,calc.soma(1,-2));
    }


}
