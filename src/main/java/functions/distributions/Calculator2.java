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
        Double tmp = 0.0;
        System.out.println("tmp1 = " + tmp.toString());
        double anotherTmp = 1.0;
        return anotherTmp;
    }
}
