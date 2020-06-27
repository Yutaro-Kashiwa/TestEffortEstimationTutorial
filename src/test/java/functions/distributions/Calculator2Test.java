package functions.distributions;
import functions.*;
import org.junit.jupiter.api.*;
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
        Calculator.aho();
    }
    @Test
    public void special_N001(){
        Calculator.A.b.echo();
    }
    @Test
    public void all(){
        Calculator c = new Calculator();
        c.aaa1(1);
        c.aaa2(1);
        c.aaa3(1);
        c.aaa4(false);
        c.aaa5((short) 1);
        c.aaa6(1);
        c.aaa7("a".getBytes()[0]);
        c.aaa8('1');
        c.aaa9("a".getBytes());
        c.aaa10(new Integer[2]);
        c.aaa11(new Integer[2]);
        c.aaa12(new Integer[2]);
    }

}
