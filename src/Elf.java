public class Elf extends Race{
    public Elf(String name, int health, int strength, boolean isAlive) {
        super(name, health, strength, isAlive);
    }

    public Elf(String name, int health, int strength) {
        super(name, health, strength);
    }

    public Elf(int health, int strength) {
        super(health, strength);
    }

    public void shout(){
        System.out.println("aaaaa");
    }

    @Override
    public void attack(Race obj) {
        shout();
        obj.health -= super.getStrength();
        System.out.println(
                super.getName() + " is attacking to " + obj.getName() +
                        " with a sword by strength " +
                        super.getStrength());
        if (obj.health <= 0) obj.setAlive(false);
    }
}
