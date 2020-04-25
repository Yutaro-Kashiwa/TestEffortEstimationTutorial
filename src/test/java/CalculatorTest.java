import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void testAdd_N001(){
        Calculator calc = new Calculator();
        calc.plus(1);
        assertEquals(calc.getAnswer(), 1);
    }
    @Test
    public void testMinos_N001(){
        Calculator calc = new Calculator();
        calc.minos(1);
        assertEquals(calc.getAnswer(), -1);
    }
    @Test
    public void testTimes_N001(){
        Calculator calc = new Calculator();
        calc.times(1);
        assertEquals(calc.getAnswer(), 0);
    }
    @Test
    public void testDivided_N001(){
        Calculator calc = new Calculator();
        calc.divided(1);
        assertEquals(calc.getAnswer(), 0);
    }


}