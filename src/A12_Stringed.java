public class A12_Stringed extends A12_MusicalInstrument {

    int quantityOfStrings;

    public A12_Stringed(String name, String manufacturer, int price, int quantityOfStrings) {
        super(name, manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }

    public String play(){
        return name + " sounds beautiful";
    }
}
