import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateSalary(){
        double total = 0.0;

        for(Employee e : employees){
            total += e.getSalary();
        }
        return total;
    }

    public double averageSalary(){
        if(employees.isEmpty()){
            return 0; //Evita a divisão por zero
        }
        return calculateSalary() / employees.size();
    }

    public void printStaff(){
        System.out.println("Departamento: " + name);
        for(Employee e : employees){
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getSalary());
        }
    }
}
