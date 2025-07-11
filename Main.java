//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Educação");

        Employee e1 = new Employee(1, "Mario", 2200.00);
        Employee e2 = new Employee(2, "Luide", 1950.00);
        Employee e3 = new Employee(3, "Princesa Peach", 10000.00);

        dept.printStaff();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}