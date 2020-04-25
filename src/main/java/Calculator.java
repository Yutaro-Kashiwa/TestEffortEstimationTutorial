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
    public void times(int x){
        this.answer*=x;
    }
    public void divided(int x){
        this.answer/=x;
    }
    public double getAnswer(){
        return answer;
    }
}
