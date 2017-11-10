package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 11/10/2017 AD.
 */

public class CalculatorTest {

    @Test
    public void twoPlusTwoEqualFour() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void sevenPlusTwoEqualNine() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(7, 2);
        assertEquals(9, result);
    }
}
