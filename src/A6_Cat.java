public class A6_Cat {
    private String name;
    private int age;
    private String owner;

    public A6_Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    void eat(){}
    void run(){}

    @Override
    public String toString() {
        return "The cat " + name + " is already " + age + ". Her master " + owner + " takes care of her.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
