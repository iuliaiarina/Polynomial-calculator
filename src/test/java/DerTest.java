import Model.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DerTest {
    @Test
    public void addTest() {
        Polynomial polynomial1 = new Polynomial();
        Polynomial result = new Polynomial();
        polynomial1.insertMonomial(0, 0);
        result.insertMonomial(0, 0);
        assertEquals(polynomial1.derivate(), result, "Derivare corecta");

        polynomial1 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(3, 2);
        polynomial1.insertMonomial(4, 3);
        result.insertMonomial(6, 1);
        result.insertMonomial(12, 2);
        assertEquals(polynomial1.derivate(), result, "Derivare corecta");

        polynomial1 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(3, 2);
        polynomial1.insertMonomial(-1, 1);
        polynomial1.insertMonomial(-1, 3);
        result.insertMonomial(6, 1);
        result.insertMonomial(-1, 0);
        result.insertMonomial(-3, 2);
        assertEquals(polynomial1.derivate() ,result, "Derivare corecta");
    }
}
