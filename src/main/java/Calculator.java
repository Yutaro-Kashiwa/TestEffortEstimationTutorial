public class Calculator {
    double answer;
    public Calculator(){
        answer = 0;
    }
    public void plus(Double x){
        this.answer+=x;
    }
    public void minos(Double x){
        this.answer-=x;
    }
    public void times(Double x){
        this.answer*=x;
    }
    public void divided(Double x){
        this.answer/=x;
    }
    public double getAnswer(){
        return answer;
    }
}
