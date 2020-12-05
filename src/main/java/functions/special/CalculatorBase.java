package functions.special;

public class CalculatorBase<T> {
    protected Double answer;
    protected T tmp;
    public  <R> void plus (Double x){
        this.answer+=x;
        System.out.println(this.answer);
    }
}
