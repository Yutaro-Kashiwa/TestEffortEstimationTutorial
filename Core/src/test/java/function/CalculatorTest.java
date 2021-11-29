package function;



import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CalculatorTest {

    @Test
    public void testDivided_N001(){
        System.out.println("testDivided_N001");
        Calculator calc = new Calculator();
        calc.divided(2);
        System.out.println(calc.getAnswer());
    }

    @Test
    public void testDivided_N002(){
        System.out.println("testDivided_N002");
        Calculator calc = new Calculator();
        calc.divided(0);
        System.out.println(calc.getAnswer());
    }

}