package function;

public class Base {
    protected Double ans = 0.0;;
    protected void add(Double x) {
        if(isNull(x, ans)){
            return;
        }
        this.ans +=x;
    }
    boolean isNull(Double x, Double answer) {
        if (x==null|answer==null){
            return true;
        }
        return false;
    }
}
