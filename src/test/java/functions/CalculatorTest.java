package functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
class CalculatorTest {
    @Deprecated
    public static void common(){
        Integer i = 0;
        i += 1;
    }
    @Test
    public void testAdd_N001(){
        Calculator calc = new Calculator();
        Calculator.getRating();
        calc.plus(1.0);
        assertEquals(calc.getAnswer(), Double.valueOf(1));
        System.out.println();
        common();
    }

//    @Test
//    public void testAdd_N002(){
//        Calculator calc = new Calculator();
//        calc.plus(0.0);
//        assertEquals(calc.getAnswer(), Double.valueOf(0));
//    }
//    @Test
//    public void testMinus_N001(){
//        Calculator calc = new Calculator();
//        calc.minus(1.0);
//        assertEquals(calc.getAnswer(), Double.valueOf(-1));
//    }
//    @Test
//    public void testMinus_N002(){
//        Calculator calc = new Calculator();
//        calc.minus(null);
//        assertEquals(calc.getAnswer(), Double.valueOf(0));
//    }
//    @Test
//    public void testTimes_N001(){
//        Calculator calc = new Calculator();
//        calc.times(1.0);
//        assertEquals(calc.getAnswer(), Double.valueOf(0));
//    }
//    @Test
//    public void testTimes_N002(){
//        Calculator calc = new Calculator();
//        calc.times(null);
//        assertEquals(calc.getAnswer(), Double.valueOf(0));
//    }
//    @Test
//    public void testDivided_N001(){
//        Calculator calc = new Calculator();
//        calc.divided(1.0);
//        assertEquals(calc.getAnswer(), Double.valueOf(0));
//    }
//    @Test
//    public void testDivided_N002(){
//        Calculator calc = new Calculator();
//        calc.divided(null);
//        assertEquals(calc.getAnswer(), Double.valueOf(0));
//    }
//    @Test
//    public void testDivided_E001(){
//        Calculator calc = new Calculator();
//        calc.divided(0.0);
//        assertNull(calc.getAnswer());
//        aho();
//    }
//    @Test
//    public void testLayer_N001(){
//        Calculator calc = new Calculator();
//        Integer i = calc.Layer1(3);
//        assertEquals(i, Integer.valueOf(4));
//    }
//    @Test
//    public void testLayer_N002(){
//        Calculator calc = new Calculator();
//        List<Integer> a = new ArrayList<Integer>();
//        a.add(1);
//        a.add(2);
//        Integer i = calc.Layer1_2(a);
//        assertEquals(i, Integer.valueOf(2));
//    }
//
//    public void testPower_N001(){
//        Calculator calc = new Calculator();
//        calc.plus(2.0);
//        calc.power(2.0);
//        assertEquals(calc.getAnswer(), Double.valueOf(4));
//    }
//    @Test
//    public void testPower_N002(){
//        Calculator calc = new Calculator();
//        calc.plus(2.0);
//        calc.power(0.0);
//        assertEquals(calc.getAnswer(), Double.valueOf(1));
//        Calculator.aho();
//    }
}