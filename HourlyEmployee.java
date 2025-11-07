/********************************************
 * Name: Michael Winstead
 * Date: 11/7/2025
 * Purpose: Assignment SDC330L 
 */
class HourlyEmployee extends Employee {
    private double HourlyRate;
    private int HoursWorked;

    public HourlyEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        HourlyRate = hourlyRate;
        HoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        Salary = HourlyRate * HoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Hourly, Hours Worked: " + HoursWorked + ", Hourly Rate: " + HourlyRate);
    }
}
