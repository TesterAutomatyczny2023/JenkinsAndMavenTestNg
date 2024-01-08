import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(Calculator.add(0,0), 0);
    }
}