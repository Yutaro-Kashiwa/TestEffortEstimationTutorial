package function;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;
    double ans;
    @Deprecated
    public static void common(){
        Integer i = 0;
        i += 1;
    }
    @BeforeAll
    public void init(){
        calc = new Calculator();
        calc.plus(1.0, 1);
        ans = calc.getAnswer();
    }

    @Test
    public void testAdd_N001(){
        assertEquals(ans, 2.0);
        System.out.println();
        common();
    }

}