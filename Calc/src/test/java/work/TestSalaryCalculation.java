package work;

import function.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSalaryCalculation {
    @Test
    public void testCalc001(){
        Calculator calc = new Calculator();
        calc.divide(2);
        System.out.println(calc.getAnswer());
    }
}
