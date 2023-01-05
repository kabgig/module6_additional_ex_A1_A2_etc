public class EX3_Ship {
    String name;
    int year;

    public EX3_Ship(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Судно " + name +
                " построено в " +
                year + " году";
    }
}
