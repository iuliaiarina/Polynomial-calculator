import Model.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntTest {
    @Test
    public void addTest() {
        Polynomial polynomial1 = new Polynomial();
        String result;
        polynomial1.insertMonomial(0, 0);
        result="+C";
        assertEquals(polynomial1.integrate(), result, "Derivare corecta");

        polynomial1 = new Polynomial();
        polynomial1.insertMonomial(3, 2);
        polynomial1.insertMonomial(4, 3);
        result="4/4*x^4+3/3*x^3+C";
        assertEquals(polynomial1.integrate(), result, "Derivare corecta");

        polynomial1 = new Polynomial();
        polynomial1.insertMonomial(3, 5);
        polynomial1.insertMonomial(-1, 1);
        polynomial1.insertMonomial(-1, 3);
        result="3/6*x^6-1/4*x^4-1/2*x^2+C";
        assertEquals(polynomial1.integrate() ,result, "Derivare corecta");
    }
}
