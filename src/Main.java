public class Main {
    public static void main(String[] args) {
        Barracks bar = new Barracks();

        bar.add(new Soldier("Bob"));
        bar.add(new Knight("Artur"));
        bar.add(new Rifleman("De Artagnian"));

        bar.visit();

    }
}