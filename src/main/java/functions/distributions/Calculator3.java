package functions.distributions;

import functions.Calculator;

import static java.lang.StrictMath.pow;

public class Calculator3 extends Calculator {
    public static TmpAttribute tmpAttribute = new TmpAttribute();
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
    public static Double getAttribute()
    {
        return tmpAttribute.getTmpAttribute();
    }
    public Double check1(Double x){
        if(x == 1.0)
            return 1.0;
        return 2.0;
    }
}
