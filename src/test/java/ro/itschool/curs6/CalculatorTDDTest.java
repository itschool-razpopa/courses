package ro.itschool.curs6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTDDTest {
    @Test
    @DisplayName("WHEN adding two zeros THEN zero is returned")
    void  addingZeroReturnsZero() {
        //setup
        CalculatorTDD calculator = new CalculatorTDD();

        //run
        int result = calculator.add(1, 1);

        //assert
        assertTrue(result == 2  );
    }

    @Test
    @DisplayName("WHEN adding two positives numbers THEN their sum is returned")
    void addingTwoPositiveReturnSum() {
        //setup
        CalculatorTDD calculator = new CalculatorTDD();

        //run
        int ret = calculator.add(4, 5);

        //assert
        assertEquals(9, ret);
    }

    @Test
    @DisplayName("WHEN divide a number at zero THEN return positive infinity")
    void divideANumberoToZeroReturnZero() {
        //setup
        CalculatorTDD calculator = new CalculatorTDD();

        //run
        int ret = calculator.division(5, 0);

        //assert
        assertEquals(0, ret);
    }

    @Test
    @DisplayName("WHEN divide a number at zero THEN return positive infinity")
    void multiplyNumberoToNegativeNumberReturnNegative() {
        //setup
        CalculatorTDD calculator = new CalculatorTDD();

        //run
        int ret = calculator.division(5, 0);

        //assert
        assertEquals(0, ret);
    }
}