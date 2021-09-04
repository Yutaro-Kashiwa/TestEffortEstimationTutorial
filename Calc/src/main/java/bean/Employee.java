package bean;

public class Employee {
    public String name;
    public int wage;
    public int totalWorkingHours;

    public Employee(String name, int wage){
        this.name=name;
        this.wage = wage;
        this.totalWorkingHours = 0;
    }
    public void recordWorking(int hours){
        this.totalWorkingHours+=hours;

    }
}
