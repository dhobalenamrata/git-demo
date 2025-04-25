package nit.GitDemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSumWithPositive() {
    	int expedted = 60;
    	int actual = App.sum(15, 45);
//        assertEquals(expedted, actual);
    }
}
