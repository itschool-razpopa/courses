package ro.itschool.curs6;


public class CalculatorTDD {
    public int add(int termen1, int termen2) {
        return termen1 + termen2;
    }

    public int division(int numarator, int numitor) {
        if (numitor == 0) {
            return  0;
        }
        return numarator / numitor;
    }

    public int multiply(int factor1, int factor2) {
        return factor1 * factor2;
    }
}
