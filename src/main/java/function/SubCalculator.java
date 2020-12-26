package function;

public class SubCalculator extends Calculator{
    protected int plusVal = 0;

    public SubCalculator(){

    }
    public void plus (Double p){
        int ans = temp(1);
        if (ans == 0){
            add(p+plusVal);
        }
    }

    protected void add(Double x) {
        if(isNull(x, answer)){
            return;
        }
        this.answer+=x;
    }
    int temp(int resize){
        final boolean isMacOs = "aaa".toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = "aaa".toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            return 1;
        }
        return 0;
    }

    private boolean wasInitialized() {
        return false;
    }


}
