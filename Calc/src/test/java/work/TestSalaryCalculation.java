package work;

import bean.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestSalaryCalculation {
    @Test
    public void testCalc001(){
        Employee worker1 = new Employee("Alice", 10);
        worker1.recordWorking(3);
        worker1.recordWorking(3);
        worker1.recordWorking(3);
        SalaryCalculation sc = new SalaryCalculation();
        int ans = (int) sc.calc(worker1);
        assertEquals(90, ans);
    }

    @Test
    public void testCalc002(){
        Employee worker1 = new Employee("Alice", 10);
        worker1.recordWorking(3);
        worker1.recordWorking(3);
        worker1.recordWorking(3);
        worker1.recordWorking(100);
        SalaryCalculation sc = new SalaryCalculation();
        int ans = (int) sc.calc(worker1);
        assertEquals(1090, ans);
    }
}
