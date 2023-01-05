public class Main {
    public static void main(String[] args) {
        Race goro = new Ork("Goro", 120, 34, true);
        Race aragorn = new Elf("Aragorn", 140,32, true);

        Race.mortalCombat(goro, aragorn);
    }
}