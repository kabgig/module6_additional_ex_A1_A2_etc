public class Main {
    public static void main(String[] args) {
        EX4_Race goro = new EX4_Ork("Goro", 120, 34, true);
        EX4_Race aragorn = new EX4_Elf("Aragorn", 140,32, true);

        EX4_Race.mortalCombat(goro, aragorn);
    }
}