public class EX4_Ork extends EX4_Race {

    public EX4_Ork(String name, int health, int strength, boolean isAlive) {
        super(name, health, strength, isAlive);
    }

    public EX4_Ork(String name, int health, int strength) {
        super(name, health, strength);
    }

    public EX4_Ork(int health, int strength) {
        super(health, strength);
    }

    @Override
    public void shout(){
        System.out.println("rrrrrr");
    }

    @Override
    public void attack(EX4_Race obj) {
        shout();
        obj.health -= super.getStrength();
        System.out.println(
                        super.getName() + " is attacking to " + obj.getName() +
                        " with a hammer by strength " +
                        super.getStrength());
        if (obj.health <= 0) obj.setAlive(false);
    }
}
