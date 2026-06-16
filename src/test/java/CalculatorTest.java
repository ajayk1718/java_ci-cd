import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void test1() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void test2() {
        assertEquals(0, Calculator.add(-2, 2));
    }

    @Test
    void test3() {
        assertEquals(10, Calculator.add(7, 3));
    }
}
