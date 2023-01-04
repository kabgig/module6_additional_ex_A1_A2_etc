public class A12_MusicalInstrument {

    String name;
    String manufacturer;
    int price;

    public A12_MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String info() {
        return name + " " + manufacturer + " " + price;
    }

}
