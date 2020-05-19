package functions;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;
public class Calculator {
    protected Double answer;
    private double tmp;
    public Calculator(){
        answer = 0.0;
    }
    public void plus (Double x){
        if(this.isNull(x, answer)){
            return;
        }
        this.answer+=x;
    }



    public void minus( Double x){
        if(this.isNull(x, answer)){
            return;
        }
        this.answer-=x;
    }
    public void times ( Double x){
        if(this.isNull(x, answer)){
            return;
        }
        this.answer*=x;
    }
    public void divided(Double x  ){
        if(Calculator.isStaticNull(x, answer)){
            return;
        }
        if (abs(x)<=0.0){
            System.err.println("the number was divided by 0");
            answer = null;
            return;
        }
        this.answer/=x;
    }


    public Double getAnswer()
    {
        int tmp=0;
        this.tmp = (double)tmp;
        return answer;
    }
    public static void aho(){
        System.out.println(1);
    }
    private boolean isNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }
    private static boolean isStaticNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }
}
