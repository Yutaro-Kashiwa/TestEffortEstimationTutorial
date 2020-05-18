package functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator2Test {
    @Test
    public void testPower_N001(){
        Calculator2 calc = new Calculator2();
        calc.plus(2.0);
        calc.power(2.0);
        assertEquals(calc.getAnswer(), Double.valueOf(4));
    }
    @Test
    public void testPower_N002(){
        Calculator2 calc = new Calculator2();
        calc.plus(2.0);
        calc.power(0.0);
        assertEquals(calc.getAnswer(), Double.valueOf(1));
    }
}
