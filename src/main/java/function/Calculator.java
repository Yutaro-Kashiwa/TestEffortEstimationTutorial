package function;

import java.util.HashMap;
import java.util.Map;

import static java.lang.StrictMath.abs;

import static java.lang.StrictMath.pow;

public class Calculator<T> {
    protected Double answer = 0.0;

    public void plus (Double p){
        add(p);
    }

    protected void add(Double x) {
        double sq = x*x;
        show(x, sq);
        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
    }
    public void show(double key, double val){
        System.out.println("key: "+key);
        System.out.println("val: "+val);
    }

    public Double getAnswer()
    {
        return answer;
    }

    boolean isNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }

    public void minus( Double x){
        if(this.isNull(x, answer)){
            return;
        }
        this.answer-=x;
    }

    public void times ( Double x){
        this.answer*=x;
    }
    public void divided(Double x  ){
        if (abs(x)<=0.0){
            System.err.println("the number was divided by 0");
            answer = null;
            return;
        }
        this.answer/=x;
    }

}
