public class Calculator {
    int answer;
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
    public int getAnswer(){
        return answer;
    }
}
