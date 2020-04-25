public class Calculator {
    double answer;
    public Calculator(){
        answer = 0;
    }
    public void plus(Double x){
        if (x==null) return;//ignore
        this.answer+=x;
    }
    public void minus(Double x){
        if (x==null) return;//ignore
        this.answer-=x;
    }
    public void times(Double x){
        if (x==null) return;//ignore
        this.answer*=x;
    }
    public void divided(Double x){
        if (x==null) return;//ignore
        this.answer/=x;
    }
    public double getAnswer(){
        return answer;
    }
}
