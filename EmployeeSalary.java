public class EmployeeSalary {

    double basicSalary = 30000;

    void calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double gross = basicSalary + hra + da;

        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Gross Salary = " + gross);

    }

    public static void main(String[] args) {

        EmployeeSalary obj = new EmployeeSalary();

        obj.calculateSalary();

    }
}
