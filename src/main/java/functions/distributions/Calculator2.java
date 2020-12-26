package functions.distributions;

import functions.*;

import static java.lang.StrictMath.pow;

public class Calculator2{
    private Calculator3 calculator3;
    private double number;
    public Double getAnswer()
    {
        //This over ride is no use
        Calculator calc = Calculator.create();
        return calc.getAnswer();
    }
    public static boolean isStaticNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }
    public Double getAttribute()
    {
        return Calculator3.getAttribute();
    }
    public Double aho(){
        double a = 1.0;
        double number = calculator3.check1_Rename();
        double b = a + number;
        double c = b + number;
        return c;
    }
}
