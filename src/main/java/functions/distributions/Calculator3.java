package functions.distributions;

import functions.Calculator;

import static java.lang.StrictMath.pow;

public class Calculator3 extends Calculator {
    public void power(Double x) {
        if (answer==null) return;//ignore
        answer = pow(answer, x);
    }
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
}
