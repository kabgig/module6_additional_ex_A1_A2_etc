public class EX3_CargoEX3Ship extends EX3_Ship {
    int cargoMass;

    public EX3_CargoEX3Ship(
            String name,
            int year,
            int cargoMass) {
        super(name, year);
        this.cargoMass = cargoMass;
    }

    @Override
    public String toString() {
        return super.toString() +
                " и способно перевезти " + cargoMass +
                " тонн 1 груза.";
    }
}
