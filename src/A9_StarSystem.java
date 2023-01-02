public class A9_StarSystem {

    private String starName;
    private int quantityOfPlanets;
    private int age;

    public A9_StarSystem(String starName, int quantityOfPlanets, int age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public String getInfo(){
        return starName + " " + quantityOfPlanets + " " + age;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
