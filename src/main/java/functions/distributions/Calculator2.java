package functions.distributions;

import functions.*;

import static java.lang.StrictMath.pow;

public class Calculator2{
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
    public static Integer aho(){
        return 1;
    }
    public Double check1(Double x){
        if(is1(x))
            return 1.0;
        return 2.0;
    }
    public boolean is1(Double x){
        if(x == 1.0)
            return true;
        return false;
    } 
}
