class Employee {
    private String employeeName;
    private double salary;
    private int yearsOfService;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getFinalSalary() {
        double bonus;

        if (yearsOfService >= 10)
            bonus = salary * 0.20;
        else if (yearsOfService >= 5)
            bonus = salary * 0.10;
        else
            bonus = salary * 0.05;

        return salary + bonus;
    }
}

public class Exp8 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeName("Ravi");
        e.setSalary(50000);
        e.setYearsOfService(6);

        System.out.println("Final Salary: " + e.getFinalSalary());
    }
}