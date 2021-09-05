package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void testDivided_N001(){
        Calculator calc = new Calculator();
        calc.devided(2);
        System.out.println(calc.getAnswer());
    }

    @Test
    public void testDivided_N002(){
        Calculator calc = new Calculator();
        calc.devided(0);
        System.out.println(calc.getAnswer());
    }

}