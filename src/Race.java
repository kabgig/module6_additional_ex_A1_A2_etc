public class Race {
    private String name;
    public int health;
    private int strength;
    private boolean isAlive;

    public Race(String name, int health, int strength, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.isAlive = isAlive;
    }

    public Race(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public Race(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public void shout() {
        System.out.println("uuuuu");
    }

    public void attack(Race obj) {
        shout();
        obj.health -= this.strength;
        if (obj.health <= 0) obj.isAlive = false;
    }

    public static void mortalCombat(Race obj1, Race obj2) {
        while (obj1.health > 0 && obj2.health > 0){
//            obj1.health -= obj2.strength;
//            obj2.health -= obj1.strength;
            obj1.attack(obj2);
            System.out.println(obj2.getName() + " health is "+ obj2.health);
            obj2.attack(obj1);
            System.out.println(obj1.getName() + " health is "+ obj1.health);

        }

        if (obj1.health <= 0 && obj2.health <= 0)
            System.out.println("All dead");
        if (obj1.health <= 0)
            System.out.println(obj2.name + " is winner");
        else
            System.out.println(obj1.name + " is winner");
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
