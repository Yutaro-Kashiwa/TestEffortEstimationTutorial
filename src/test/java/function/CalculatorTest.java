package function;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;
    @Deprecated
    public static void common(){
        Integer i = 0;
        i += 1;
    }
    @BeforeAll
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void testAdd_N001(){
        calc.plus(1.0, 1);
        assertEquals(calc.getAnswer(), Double.valueOf(2));
        System.out.println();
        common();
    }

}