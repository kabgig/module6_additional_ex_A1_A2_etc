public class Ork extends Race{

    public Ork(String name, int health, int strength, boolean isAlive) {
        super(name, health, strength, isAlive);
    }

    public Ork(String name, int health, int strength) {
        super(name, health, strength);
    }

    public Ork(int health, int strength) {
        super(health, strength);
    }

    @Override
    public void shout(){
        System.out.println("rrrrrr");
    }

    @Override
    public void attack(Race obj) {
        shout();
        obj.health -= super.getStrength();
        System.out.println(
                        super.getName() + " is attacking to " + obj.getName() +
                        " with a hammer by strength " +
                        super.getStrength());
        if (obj.health <= 0) obj.setAlive(false);
    }
}
