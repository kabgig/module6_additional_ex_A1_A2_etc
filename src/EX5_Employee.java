import java.util.ArrayList;

public class EX5_Employee {
    String name;
    int age;
    String position;

    public EX5_Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public static void countObjects(ArrayList<EX5_Employee> list) {
        System.out.println(list.size());
    }
}
