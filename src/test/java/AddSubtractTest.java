import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddSubtractTest {

    @Test
    public void testAddition() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 15;

        int result = AddSubtract.add(num1, num2);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtraction() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 5;

        int result = AddSubtract.subtract(num1, num2);

        assertEquals(expectedResult, result);
    }
}

