public class Main {
    public static void main(String[] args) {
        EX2_Barracks bar = new EX2_Barracks();

        bar.add(new EX2_Soldier("Bob"));
        bar.add(new EX2_Knight("Artur"));
        bar.add(new EX2_Rifleman("De Artagnian"));

        bar.visit();
    }
}