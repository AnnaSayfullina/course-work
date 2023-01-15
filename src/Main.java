public class Main {
    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook(15);
        employees.createNewEmployee("Сидоров Павел Петрович", 1, 25000);
        employees.createNewEmployee("Иванов Иван Иванович", 1, 28000);
        employees.createNewEmployee("Федоров Федор Федорович", 1, 50000);
        employees.createNewEmployee("Петров Петр Петрович", 2, 35000);
        employees.createNewEmployee("Кириллов Кирилл Кириллович", 2, 32000);
        employees.createNewEmployee("Степанов Степан Степанович", 2, 36000);
        employees.createNewEmployee("Любимова Любовь Мирославовна", 3, 45000);
        employees.createNewEmployee("Пирогова Надежда Павловна", 3, 29000);
        employees.createNewEmployee("Лебедева Вера Николаевна", 3, 31000);
        employees.createNewEmployee("Смирнов Андрей Олегович", 4, 43000);
        employees.createNewEmployee("Денисов Денис Денисович", 4, 46000);
        employees.createNewEmployee("Михайлов Михаил Михайлович", 4, 51000);
        employees.createNewEmployee("Витальев Виталий Витальевич", 5, 44000);
        employees.createNewEmployee("Павлов Павел Павлович", 5, 21000);
        employees.createNewEmployee("Артемьев Артем Артемович", 5, 39000);

        employees.printEmployees();
        System.out.println();
        System.out.printf("Сумма затрат на зарплаты в месяц составляет %.2f рублей%n", employees.calculateAllSalaries());
        System.out.printf("Среднее значение зарплат %.2f рублей%n", employees.calculateMiddleSalary());
        System.out.println();
        employees.printFullNameAllEmployees();
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой" + "\n" + employees.findEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой" + "\n" + employees.findEmployeeWithMinSalary());
        System.out.println();
        employees.increaseSalaryByPercent(5);
        employees.printEmployees();
        System.out.println();
        employees.printEmployeeWithMaxSalaryInDepartment(3);
        employees.printEmployeeWithMinSalaryInDepartment(5);
        employees.printSalariesOfDepartment(4);
        employees.printMiddleSalariesOfDepartment(4);
        employees.increaseSalaryByPercentInDepartment(5, 4);
        System.out.println();
        employees.printEmployeesDepartment(1);
        System.out.println();
        employees.printEmployeesSalaryIsLessThan(30000);
        System.out.println();
        employees.printEmployeesSalaryIsMoreThan(40000);


    }
}