package function;

public class SubCalculator extends Calculator{
    protected int plusVal = 0;

    public SubCalculator(){

    }
    public void plus (Double p){
        add(p+plusVal);
    }

    protected void add(Double x) {
        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
    }




}
