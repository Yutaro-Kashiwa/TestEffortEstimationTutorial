package function;

public class Calculator2 extends Calculator{
    protected void add(Double x) {
        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
    }
}
