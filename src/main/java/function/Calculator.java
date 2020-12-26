package function;

import static java.lang.StrictMath.abs;

import static java.lang.StrictMath.pow;

public class Calculator<T> {
    protected Double answer = 0.0;;
    public Calculator(){
    }
    public void plus (Double p){
        add(p);
    }

    protected void add(Double x) {
        final double temp = 2 * (x + x);
        System.out.println(temp);
        final double sq = x * x;
        System.out.println(sq);

        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
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
