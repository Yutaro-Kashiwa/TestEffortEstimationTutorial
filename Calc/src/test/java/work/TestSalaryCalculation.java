package work;

import bean.Employee;
import function.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class TestSalaryCalculation {
    protected abstract void dooo();

    @Test
    public void testCalc001(){
        dooo();
        Employee worker1 = new Employee("Alice", 10);
        worker1.recordWorking(3);
        worker1.recordWorking(3);
        worker1.recordWorking(3);
        SalaryCalculation sc = new SalaryCalculation();
        int ans = (int) sc.calc(worker1);
        assertEquals(90, ans);
    }
}
