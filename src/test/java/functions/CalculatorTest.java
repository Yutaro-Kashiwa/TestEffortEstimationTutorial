package functions;

import functions.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
class CalculatorTest {

    @Test
    public void testAdd_N001(){
        Calculator calc = new Calculator();
        calc.plus(1.0);
        assertEquals(calc.getAnswer(), Double.valueOf(1));
    }
    @Test
    public void testAdd_N002(){
        Calculator calc = new Calculator();
        calc.plus(null);
        assertEquals(calc.getAnswer(), Double.valueOf(0));
    }
    @Test
    public void testMinus_N001(){
        Calculator calc = new Calculator();
        calc.minus(1.0);
        assertEquals(calc.getAnswer(), Double.valueOf(-1));
    }
    @Test
    public void testMinus_N002(){
        Calculator calc = new Calculator();
        calc.minus(null);
        assertEquals(calc.getAnswer(), Double.valueOf(0));
    }
    @Test
    public void testTimes_N001(){
        Calculator calc = new Calculator();
        calc.times(1.0);
        assertEquals(calc.getAnswer(), Double.valueOf(0));
    }
    @Test
    public void testTimes_N002(){
        Calculator calc = new Calculator();
        calc.times(null);
        assertEquals(calc.getAnswer(), Double.valueOf(0));
    }
    @Test
    public void testDivided_N001(){
        Calculator calc = new Calculator();
        calc.divided(1.0);
        assertEquals(calc.getAnswer(), Double.valueOf(0));
    }
    @Test
    public void testDivided_N002(){
        Calculator calc = new Calculator();
        calc.divided(null);
        assertEquals(calc.getAnswer(), Double.valueOf(0));
    }
    @Test
    public void testDivided_E001(){
        Calculator calc = new Calculator();
        calc.divided(0.0);
        assertNull(calc.getAnswer());
    }
    @Test
    public void testPower_N001(){
        Calculator calc = new Calculator();
        calc.plus(2.0);
        calc.power(2);
        assertEquals(calc.getAnswer(), Double.valueOf(4));
    }
    @Test
    public void testPower_N002(){
        Calculator calc = new Calculator();
        calc.plus(2.0);
        calc.power(0);
        assertEquals(calc.getAnswer(), Double.valueOf(1));
    }
}