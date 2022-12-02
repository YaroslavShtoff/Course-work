import java.util.Locale;

public class Main {


    private static final Employee[] EMPLOYEES = new Employee[10];


    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Андреев Андрей Андреевич", 1, 53_000);
        EMPLOYEES[1] = new Employee("Борисов Борис Борисович", 2, 57_000);
        EMPLOYEES[2] = new Employee("Владимиров Владимир Владимирович", 3, 60_000);
        EMPLOYEES[3] = new Employee("Григорьев Григорий Григорьевич", 3, 48_000);
        EMPLOYEES[4] = new Employee("Дмитриев Дмитрий Дмитриевич", 4, 51_000);
        EMPLOYEES[5] = new Employee("Егоров Егор Егорьевич", 1, 58_000);
        EMPLOYEES[6] = new Employee("Игорев Игорь Игоревич", 4, 62_000);

        printFullInfo();
        int totalSalaries = getTotalSalaries();
        System.out.println(" Сумма З,П, - " + totalSalaries);
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с мининимальной З.П. :" + employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной З.П. :" + employeeWithMaxSalary);
        double averageSalary = findAverageSalary();
        System.out.printf(Locale.US,"Средняя З.П.: %.2f%n", averageSalary);
        printFullNameInfo();

    }

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {

                System.out.println(employee);
            }
        }
    }

    private static int getTotalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getSalary();


                System.out.println(employee);
            }

        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;

            }

        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;

            }

        }
        return employeeWithMaxSalary;
    }

    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }

        }
        if (count != 0) {
            return (double) getTotalSalaries()/count;
        }
        return 0;
    }
    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {

                System.out.println(employee.getFullName());
            }
        }
    }
}
