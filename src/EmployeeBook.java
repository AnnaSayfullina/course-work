public class EmployeeBook {
    private Employee[] employees;
    private int sizeArray;

    public EmployeeBook(int sizeArray){
        this.employees = new Employee[sizeArray];
        this.sizeArray = sizeArray;
    }
    public Employee[] getEmployees(){
        return this.employees;
    }
    public void addEmployeeToArray(Employee name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = name;
                return;
            }
        }
    }
    public void createNewEmployee(String fullName, int department, int salary){
        Employee name = new Employee(fullName, department, salary);
        addEmployeeToArray(name);
    }
    public void printEmployees(){
        for (int i = 0; i < getEmployees().length; i++) {
            System.out.println(getEmployees()[i]);
        }
    }
    public double calculateAllSalaries(){
        double sum = 0;
        for (int i = 0; i < getEmployees().length; i++){
            sum += employees[i].getSalary();
        }
        return sum;
    }
    public double calculateMiddleSalary(){
        return calculateAllSalaries()/employees.length;
    }
    public void printFullNameAllEmployees(){
        System.out.println("Ф.И.О. всех сотрудников:");
        for (int i = 0; i < getEmployees().length; i++) {
            System.out.println(getEmployees()[i].getName());
        }
    }

}
