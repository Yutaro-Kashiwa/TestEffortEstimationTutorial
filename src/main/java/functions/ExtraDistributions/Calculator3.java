package functions.ExtraDistributions;

import functions.Calculator;

import static java.lang.StrictMath.pow;

public class Calculator3 extends Calculator {
    public static Double tmpAttribute = 0.0;
    public Double getAnswer()
    {
        //This over ride is no use
        return super.getAnswer();
    }
    public static boolean isStaticNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }
    public Double getAttribute()
    {
        return tmpAttribute;
    }
}
