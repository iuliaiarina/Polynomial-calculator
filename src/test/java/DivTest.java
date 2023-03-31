import Model.Polynomial;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivTest {
    @Test
    public void addTest() {
        Polynomial polynomial1 = new Polynomial();
        Polynomial polynomial2 = new Polynomial();
        Polynomial r= new Polynomial();
        Polynomial c= new Polynomial();
        polynomial1.insertMonomial(4, 2);
        polynomial2.insertMonomial(2, 1);
        r.insertMonomial(0, 0);
        c.insertMonomial(2,1);
        Polynomial[] result=polynomial1.division(polynomial2);
        assertEquals(c, result[0], "Impartire corecta");
        assertEquals(r, result[1], "Impartire corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        r= new Polynomial();
        c= new Polynomial();
        polynomial1.insertMonomial(1, 3);
        polynomial1.insertMonomial(-2, 2);
        polynomial1.insertMonomial(6, 1);
        polynomial1.insertMonomial(-5, 0);
        polynomial2.insertMonomial(1, 2);
        polynomial2.insertMonomial(-1, 0);
        r.insertMonomial(7, 1);
        r.insertMonomial(-7, 0);
        c.insertMonomial(1,1);
        c.insertMonomial(-2,0);
        result=polynomial1.division(polynomial2);
        assertEquals(c, result[0], "Impartire corecta");
        assertEquals(r, result[1], "Impartire corecta");

        polynomial1 = new Polynomial();
        polynomial2 = new Polynomial();
        r= new Polynomial();
        c= new Polynomial();
        polynomial1.insertMonomial(1, 6);
        polynomial2.insertMonomial(1, 3);
        r.insertMonomial(0, 0);
        c.insertMonomial(1,3);
        result=polynomial1.division(polynomial2);
        assertEquals(c, result[0], "Impartire corecta");
        assertEquals(r, result[1], "Impartire corecta");
    }
}
