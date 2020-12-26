package function;

public class SubCalculator extends Calculator{
    protected int plusVal = 0;

    public SubCalculator(){

    }
    public void plus (Double p){
        add(p+plusVal);
        temp(1);
    }

    protected void add(Double x) {
        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
    }
    void temp(int resize){
        if (("aaa".toUpperCase().indexOf("MAC") > -1) &&
                ("aaa".toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }


}
