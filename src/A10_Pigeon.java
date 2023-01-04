public class A10_Pigeon extends A10_Bird {

    int hunger;

    public A10_Pigeon(String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;
    }

    public void askForSeeds(){
        hunger -= 7;
        if (hunger < 0) hunger = 0;
    }

    public void sleep() {
        hunger += 3;
    }

    public int getHunger() {
        return hunger;
    }
}
