package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd_N001(){
        Calculator calc = new Calculator();
        calc.plus(1.0, 1);
        calc.plus(1.0, 1);
        calc.plus(1.0, 1);
        calc.plus(1.0, 1);
        calc.plus(1.0, 1);
    }

}