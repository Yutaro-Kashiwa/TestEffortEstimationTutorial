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
        final boolean isMacOs = "aaa".toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = "aaa".toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }


}
