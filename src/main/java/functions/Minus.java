package functions;

public class Minus {
	protected Double answer;
	public Minus(){
		answer = 1.0;
	}
	public void minus( Double x){
        if(x == null || answer == null){
            return;
        }
        this.answer-=x;
    }
}
