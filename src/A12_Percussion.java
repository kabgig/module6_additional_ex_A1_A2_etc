public class A12_Percussion extends A12_MusicalInstrument {

    public A12_Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }

    int year;

    public String play(){
        return "Bump";
    }

}
