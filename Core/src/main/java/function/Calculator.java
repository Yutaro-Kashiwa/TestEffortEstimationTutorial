package function;

public class Calculator {
    double answer;
    public Calculator(){
        answer = 0;
    }
    public void plus(int x){
        this.answer+=x;
    }
    public void minos(int x){
        this.answer-=x;
    }
    public void multiply(int x){
        this.answer*=x;
    }
    public void divide(int x){
        if (x==0){
            return;
        }
        this.answer/=x;
    }
    public double getAnswer(){
        return answer;
    }
}
