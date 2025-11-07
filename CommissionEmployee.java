/********************************************
 * Name: Michael Winstead
 * Date: 10/29/2025
 * Purpose: Assignment SDC330L project 3.2
 */
class CommissionEmployee extends Employee {
    private double Sales;
    private double CommissionRate;

    public CommissionEmployee(int id, String name, double sales, double commissionRate) {
        super(id, name);
        Sales = sales;
        CommissionRate = commissionRate;
    }

    @Override
    public void calculatePay() {
        Salary = Sales * CommissionRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Commission, Sales: " + Sales + ", Commission Rate: " + CommissionRate);
    }
}

