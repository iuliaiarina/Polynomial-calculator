import Model.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {
    @Test
    public void addTest() {
        Polynomial polynomial1 = new Polynomial();
        Polynomial polynomial2 = new Polynomial();
        Polynomial result = new Polynomial();
        polynomial1.insertMonomial(0, 0);
        polynomial2.insertMonomial(0, 1);
        result.insertMonomial(0, 0);
        assertEquals(polynomial1.subtract(polynomial2), result, "Scadere corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(0, 0);
        polynomial2.insertMonomial(3, 2);
        result.insertMonomial(-3, 2);
        assertEquals(polynomial1.subtract(polynomial2), result, "Scadere corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(2, 3);
        polynomial1.insertMonomial(-4, 2);
        polynomial2.insertMonomial(-1, 3);
        polynomial2.insertMonomial(-2, 2);
        polynomial2.insertMonomial(8, 0);
        result.insertMonomial(3, 3);
        result.insertMonomial(-2, 2);
        result.insertMonomial(-8, 0);
        assertEquals(polynomial1.subtract(polynomial2), result, "Scadere corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(1, 5);
        polynomial1.insertMonomial(2, 3);
        polynomial2.insertMonomial(1, 5);
        polynomial2.insertMonomial(2, 3);
        polynomial2.insertMonomial(7, 0);
        result.insertMonomial(-7, 0);
        assertEquals(polynomial1.subtract(polynomial2), result, "Scadere corecta");
    }
}
