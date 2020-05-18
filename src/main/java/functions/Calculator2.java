package functions;

import static java.lang.StrictMath.pow;

public class Calculator2 extends Calculator {
    public void power(Double x) {
        if (answer==null) return;//ignore
        answer = pow(answer, x);
    }
    public Double getAnswer()
    {
        //This over ride is no use
        return answer;
    }
}
