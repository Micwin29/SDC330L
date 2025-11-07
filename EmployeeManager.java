/********************************************
 * Name: Michael Winstead
 * Date: 11/7/2025
 * Purpose: Assignment SDC330L Project
 */
class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        System.out.println("Employee removed successfully!");
    }

    public void updateEmployee(int id, Employee newData) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, newData);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void displayAllEmployees() {
        for (Employee e : employees) {
            e.displayInfo();
            System.out.println("-----");
        }
    }

    public void displayEmployeesByType(Class type) {
        for (Employee e : employees) {
            if (type.isInstance(e)) {
                e.displayInfo();
                System.out.println("-----");
            }
        }
    }
}

