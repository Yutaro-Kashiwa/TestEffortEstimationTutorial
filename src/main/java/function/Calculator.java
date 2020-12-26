package function;

import static java.lang.StrictMath.abs;

import static java.lang.StrictMath.pow;

public class Calculator<T> {
    private static final Double DEFAULT = 1.0;
    protected Double answer = 0.0;
    public final static int rate = 1;

    public Calculator(){
    }
    public void plus (Double p){
        add(p);
        test(DEFAULT);
    }
    public void test(Double d){
        System.out.println(d);
    }
    protected void add(Double x) {
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
