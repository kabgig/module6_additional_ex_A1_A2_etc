public class A8_PedigreeCat extends A6_Cat {

    private String breed;

    public A8_PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "The cat " + super.getName() +
                " is very beautiful, although she is now " + super.getAge() +
                ", she belongs to the breed " + breed + ", and her owner " +
                super.getOwner() + " is very proud of her.";
    }
}
