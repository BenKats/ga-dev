import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    Calculate cal = new Calculate();
    int sum = cal.sum(2,2);
    int testSum = 7;

    @Test
    public void sum() {
        assertEquals(testSum, sum);
    }
}