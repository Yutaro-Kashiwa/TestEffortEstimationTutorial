package function;

import java.util.LinkedList;

import static java.lang.StrictMath.abs;

import static java.lang.StrictMath.pow;

public class Calculator<T> {
    protected Double answer;
    protected T tmp;
    public LinkedList<Integer> queue;

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

    public void plus (Double x){
        int i = 0;
        i += x.intValue();
        boolean a = i > 0;
        if (a){
            return;
        }
        System.out.println(tmp);
        add(x);
        System.out.println(queue);
    }

    protected void add(Double x) {
        if(isNull(x, answer)){
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
    boolean isNull(Double x, Double answer) {
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
