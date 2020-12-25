package functions;

import static functions.Util.getRating;
import static java.lang.StrictMath.abs;

import java.util.List;
import static java.lang.StrictMath.pow;

public class Calculator<T> {
    protected Double answer;
    protected T tmp;
    public Calculator(){
        answer = 0.0;
        tmp = null;
        Car car = Car.TOYOTA;
        car.values();
    }

    public void power(Double x) {
        if (answer==null) return;//ignore
        answer = pow(answer, x);
    }
    public T tmp(T t){
        return t;
    }

    public  <R> void plus (Double x){
        int i = 0;
        i += x.intValue();
        System.out.println(tmp);
        add(x);
    }

    private void add(Double x) {
        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
        getRating();
    }
    public static int getRating() {
        return 1 > 5 ? 2 : 1;
    }


    public void minus( Double x){
        if(this.isNull(x, answer)){
            return;
        }
        this.answer-=x;
    }

    public void times ( Double x){
        if(isStaticNull(x, answer)){
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
    public static boolean isStaticNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }


    public class SubClass{
        public SubClass(){
            ABC a = new ABC();
            SayHello();
        }
        public class ABC{

        }
        public void SayHello(){
            System.out.println("Hello World");
        }
    }

}
