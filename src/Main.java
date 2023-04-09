public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов И.И.", 1, 15_000);
        employeeBook.addEmployee("Петров П.П.", 2, 35_000);
        employeeBook.addEmployee("Сидоров С.С.", 3, 40_000);
        employeeBook.addEmployee("Смирнов С.С.", 4, 60_000);
        employeeBook.addEmployee("Лебедев Л.Л.", 5, 30_000);
        employeeBook.addEmployee("Голубев Г.Г.", 1, 55_000);
        employeeBook.addEmployee("Дятлов Д.Д.", 2, 65_000);
        employeeBook.addEmployee("Сойкин С.С.", 3, 53_000);
        employeeBook.addEmployee("Орлов О.О.", 4, 80_000);
        employeeBook.addEmployee("Соколов С.С.", 5, 70_000);

        employeeBook.printAllEmployees();

    }


}
