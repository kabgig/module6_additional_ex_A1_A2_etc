public class EX4_Elf extends EX4_Race {
    public EX4_Elf(String name, int health, int strength, boolean isAlive) {
        super(name, health, strength, isAlive);
    }

    public EX4_Elf(String name, int health, int strength) {
        super(name, health, strength);
    }

    public EX4_Elf(int health, int strength) {
        super(health, strength);
    }

    public void shout(){
        System.out.println("aaaaa");
    }

    @Override
    public void attack(EX4_Race obj) {
        shout();
        obj.health -= super.getStrength();
        System.out.println(
                super.getName() + " is attacking to " + obj.getName() +
                        " with a sword by strength " +
                        super.getStrength());
        if (obj.health <= 0) obj.setAlive(false);
    }
}
