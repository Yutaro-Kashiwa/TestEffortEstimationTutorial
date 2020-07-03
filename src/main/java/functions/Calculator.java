package functions;

import functions.special.B;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;
public class Calculator<T> {
    protected Double answer;
    protected T tmp;
    public Calculator(){
        answer = 0.0;
        tmp = null;
    }
    public T tmp(T t){
        return t;
    }
    public void plus (Double x){
        System.out.println(tmp);
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
    public void aaa1(int i){}
    public void aaa1_1(int i, double j, Double d){}
    public void aaa2(double i){}
    public void aaa3(float i){}
    public void aaa4(boolean i){}
    public void aaa5(short i){}
    public void aaa6(long i){}
    public void aaa7(byte i){}
    public void aaa8(char i){}
    public void aaa9(byte[] i){}
    public void aaa10(Integer[] i){}
    public void aaa11(Integer... i){}
    public void aaa12(Double[][] i){
        SubClass b = new SubClass();
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
    private void aaa(Double x,
                     Double answer,
                     Double answer1,
                     Double answe4) {
        System.out.println(x+""+answer+""+answer1+""+answe4);
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.plus(1.0);
        System.out.println(calc.getAnswer());
        String a = "/Users/yutarokashiwa/.m2/repository/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar,org/opentest4j/AssertionFailedError,org/opentest4j/AssertionFailedError,Normal,5c926c86eeaa81c12cd59061b6a0d03afd5a2f21";
        if(a.contains("/.m2/")){
            System.out.println("YES");
        }
    }
    public static class A {
        public static B b;

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
