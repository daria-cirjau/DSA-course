import com.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(3, 4);

        assertEquals(result, 7);
    }

    @Test
    public void testSubstract() {
        int result = calculator.substract(3, 4);

        assertEquals(result, -1);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 4);

        assertEquals(result, 12);
    }

    @Test
    public void testDivide() {
        int result = calculator.add(4, 2);

        assertEquals(result, 2);
    }
}
