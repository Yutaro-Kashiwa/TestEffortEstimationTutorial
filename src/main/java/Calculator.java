import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;
public class Calculator {
    Double answer;
    public Calculator(){
        answer = 0.0;
    }
    public void plus (Double x){
        if (x==null|answer==null) return;//ignore
        this.answer+=x;
    }
    public void minus( Double x){
        if (x==null|answer==null) return;//ignore
        this.answer-=x;
    }
    public void times ( Double x){
        if (x==null|answer==null) return;//ignore
        this.answer*=x;
    }
    public void divided(Double x  ){
        if (x==null|answer==null) return;//ignore
        if (abs(x)<=0.0){
            System.err.println("the number was divided by 0");
            answer = null;
            return;
        }
        this.answer/=x;
    }
    public void power(int x) {
        if (answer==null) return;//ignore
        answer = pow(answer, x);
    }

    public Double getAnswer()
    {
        return answer;
    }
}
