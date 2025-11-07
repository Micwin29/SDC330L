/********************************************
 * Name: Michael Winstead
 * Date: 11/7/2025
 * Purpose: Assignment SDC330L Project
 */
public class App {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Week 3 Employee Management Application ===");
        System.out.println("Author: Your Name");
        System.out.println("Welcome! Use the menu to manage employees.\n");

        // Example data
        manager.addEmployee(new SalariedEmployee(1, "Alice", 60000));
        manager.addEmployee(new HourlyEmployee(2, "Bob", 20, 160));
        manager.addEmployee(new CommissionEmployee(3, "Charlie", 5000, 0.10));

        manager.displayAllEmployees();

        sc.close();
    }
}
