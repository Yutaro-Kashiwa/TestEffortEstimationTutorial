package work;

import bean.Employee;
import function.Calculator;

public class SalaryCalculation {
    public double calc(Employee worker){
        Calculator calc = new Calculator();
        calc.plus(worker.wage);
        calc.multiply(worker.totalWorkingHours);
        return calc.getAnswer();
    }
}
