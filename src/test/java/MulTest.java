import Model.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MulTest {
    @Test
    public void addTest() {
        Polynomial polynomial1 = new Polynomial();
        Polynomial polynomial2 = new Polynomial();
        Polynomial result = new Polynomial();
        polynomial1.insertMonomial(0, 0);
        polynomial2.insertMonomial(0, 1);
        result.insertMonomial(0, 0);
        assertEquals(polynomial1.multiplicate(polynomial2), result, "Inmultire corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(1, 2);
        polynomial1.insertMonomial(1, 3);
        polynomial2.insertMonomial(1, 2);
        polynomial2.insertMonomial(-1, 3);
        result.insertMonomial(1, 4);
        result.insertMonomial(-1, 6);
        assertEquals(polynomial1.multiplicate(polynomial2), result, "Inmultire corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        result = new Polynomial();
        polynomial1.insertMonomial(3, 2);
        polynomial1.insertMonomial(-1, 1);
        polynomial1.insertMonomial(1, 0);
        polynomial2.insertMonomial(1, 1);
        polynomial2.insertMonomial(-2, 0);
        result.insertMonomial(3, 3);
        result.insertMonomial(-7, 2);
        result.insertMonomial(3, 1);
        result.insertMonomial(-2, 0);
        assertEquals(polynomial1.multiplicate(polynomial2), result, "Inmultire corecta");
    }

}
