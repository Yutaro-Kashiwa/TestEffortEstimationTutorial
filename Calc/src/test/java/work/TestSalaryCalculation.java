package work;

import bean.Employee;
import function.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSalaryCalculation {
    @Test
    public void testCalc001(){
        Calculator calc = new Calculator();
        calc.devided(2);
        System.out.println(calc.getAnswer());
    }
}
