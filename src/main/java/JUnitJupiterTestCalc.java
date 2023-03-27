import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class JUnitJupiterTestCalc {

    private final Calculate calc = new Calculate();
    @Test
    void subtraction() {
        assertEquals(0.0, calc.sub(1.0,1.0));
    }
    @Test
    void addition() {
        assertEquals(2.0, calc.add(1.0,1.0));
    }

    @Test
    void multiplication() {
        assertEquals(6.0, calc.mul(2.0, 3.0));
    }

    @Test
    void division() {
        assertEquals(2.0, calc.div(4.0, 2.0));
    }

}