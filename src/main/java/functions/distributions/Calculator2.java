package functions.distributions;

import functions.*;

import static java.lang.StrictMath.pow;

public class Calculator2{
    private Calculator3 calculator3;
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
        double b = a + calculator3.check1_Rename();
        double c = b + calculator3.check1_Rename();
        return c;
    }
}
