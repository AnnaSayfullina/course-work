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
        System.out.println("Все сотрудники:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public double calculateAllSalaries(){
        double sum = 0;
        for (int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
        }
        return sum;
    }
    public double calculateMiddleSalary(){
        return calculateAllSalaries()/employees.length;
    }
    public void printFullNameAllEmployees(){
        System.out.println("Ф.И.О. всех сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(getEmployees()[i].getName());
        }
    }
    public Employee findEmployeeWithMaxSalary(){
        double maxSalary = employees[0].getSalary();
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++){
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }
    public Employee findEmployeeWithMinSalary(){
        double minSalary = employees[0].getSalary();
        Employee minEmployee = employees[0];
        for (int i = 1; i < employees.length; i++){
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minEmployee = employees[i];
            }
        }
        return minEmployee;
    }
    public void increaseSalaryByPercent(double percent){
        percent = 0.01 * percent;
        for (int i = 0; i < employees.length; i++){
            employees[i].setSalary(employees[i].getSalary() * (1 + percent));
        }
    }
    public Employee findEmployeeWithMaxSalaryInDepartment(int department){
        double maxSalary = 0;
        Employee maxEmployeeDepartment = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalary) {
                    maxEmployeeDepartment = employees[i];
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        return maxEmployeeDepartment;
    }
    public void printEmployeeWithMaxSalaryInDepartment(int department){
        Employee name = findEmployeeWithMaxSalaryInDepartment(department);
        System.out.printf("В отделе %d сотрудник %s с максимальной зарплатой %.2f рублей%n", name.getDepartment(), name.getName(), name.getSalary());
    }
    public Employee findEmployeeWithMinSalaryInDepartment(int department){
        double minSalary = Integer.MAX_VALUE;
        Employee minEmployeeDepartment = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalary) {
                    minEmployeeDepartment = employees[i];
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minEmployeeDepartment;
    }
    public void printEmployeeWithMinSalaryInDepartment(int department){
        Employee name = findEmployeeWithMinSalaryInDepartment(department);
        System.out.printf("В отделе %d сотрудник %s с минимальной зарплатой %.2f рублей%n", name.getDepartment(), name.getName(), name.getSalary());
    }
    public double calculateSalariesOfDepartment(int department){
        double sum = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }
    public void printSalariesOfDepartment(int department){
        System.out.printf("Сумма затрат на зарплату по отделу %d составила %.02f рублей%n", department, calculateSalariesOfDepartment(department));
    }
    public double calculateMiddleSalariesOfDepartment(int department) {
        double sum = calculateSalariesOfDepartment(department);
        int numbers = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartment() == department) {
                numbers++;
            }
        }
        return sum/numbers;
    }
    public void printMiddleSalariesOfDepartment(int department){
        System.out.printf("Средняя зарплата по отделу %d составила %.02f рублей%n", department, calculateMiddleSalariesOfDepartment(department));
    }
    public void increaseSalaryByPercentInDepartment(double percent, int department){
        percent = 1+ 0.01 * percent;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * percent);
            }
        }
    }
    public void printEmployeesDepartment(int department){
        System.out.println("Сотрудники отдела " + department);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getName() +", зарплата "+ employees[i].getSalary()+" рублей, id " + employees[i].getId());
            }
        }
    }
    public void printEmployeesSalaryIsLessThan (int salary){
        System.out.println("Сотрудники с зарплатой меньше " + salary + " рублей:");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < salary){
                System.out.println(employees[i].getName() +", зарплата "+ employees[i].getSalary()+" рублей, id " + employees[i].getId());
            }
        }
    }
    public void printEmployeesSalaryIsMoreThan (int salary){
        System.out.println("Сотрудники с зарплатой больше (или равной) " + salary + " рублей:");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() >= salary){
                System.out.println(employees[i].getName() +", зарплата "+ employees[i].getSalary()+" рублей, id " + employees[i].getId());
            }
        }
    }




}
