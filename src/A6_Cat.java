public class A6_Cat {
    String name;
    int age;
    String owner;

    public A6_Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "The cat " + name + " is already " + age + ". Her master " + owner + " takes care of her.";
    }
}
