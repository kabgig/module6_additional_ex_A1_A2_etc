public class EX2_Rifleman extends EX2_Soldier {

    public EX2_Rifleman(String name) {
        super(name);
        this.price = 205;
        this.phrase = "Мушкет и жену не дам никому";
    }

    @Override
    public void attack() {
        System.out.println(super.name + " атакует с оружием!");
    }
}
