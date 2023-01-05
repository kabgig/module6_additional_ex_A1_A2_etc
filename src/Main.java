import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<EX5_Employee> EX5Employees = new ArrayList<>();

        EX5Employees.add(new EX5_Employee("john", 33, "director"));
        EX5Employees.add(new EX5_Driver("john", 33, "toyota"));
        EX5Employees.add(new EX5_Employee("bob", 32, "vice-president"));

        for (var men : EX5Employees){
            System.out.println(
                    men.name + " " +
                    men.age + " "+
                    men.position);
        }
        EX5_Employee.countObjects(EX5Employees);
    }
}