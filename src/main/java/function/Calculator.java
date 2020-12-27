package function;

import static java.lang.StrictMath.abs;

public class Calculator<T> extends Base{
    int i;

    public Calculator(){
    }
    public void plus (Double p){
        add(p);
        System.out.println(i);
    }



    public Double getAnswer()
    {
        return ans;
    }



    public void minus( Double x){
        if(this.isNull(x, ans)){
            return;
        }
        this.ans -=x;
    }

    public void times ( Double x){
        this.ans *=x;
    }
    public void divided(Double x  ){
        if (abs(x)<=0.0){
            System.err.println("the number was divided by 0");
            ans = null;
            return;
        }
        this.ans /=x;
    }

}
