package functions;

public class Minus {
	protected Double answer;
	public Minus(Double answer){
		this.answer = answer;
	}
	public Double minus( Double x){
        if(x == null || answer == null){
            return null;
        }
        return this.answer-=x;
    }
}
