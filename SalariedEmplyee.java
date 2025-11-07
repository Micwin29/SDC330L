/********************************************
 * Name: Michael Winstead
 * Date: 11/7/2025
 * Purpose: Assignment SDC330L Project
 */
class SalariedEmployee extends Employee {
    private double YearlySalary;

    public SalariedEmployee(int id, String name, double yearlySalary) {
        super(id, name);
        YearlySalary = yearlySalary;
    }

    @Override
    public void calculatePay() {
        Salary = YearlySalary / 12; // monthly pay
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Salaried, Yearly Salary: " + YearlySalary);
    }
}
