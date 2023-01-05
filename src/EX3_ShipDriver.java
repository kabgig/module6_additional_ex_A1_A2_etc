public class EX3_ShipDriver {
    public static void main(String[] args) {
        EX3_Ship EX3Ship = new EX3_Ship("Black Pearl", 1870);
        EX3_Ship costa = new EX3_PassengerEX3Ship
                ("Costa", 2010,5000 );
        EX3_Ship MSC = new EX3_CargoEX3Ship
                ("MSC", 2000, 50_000);

        System.out.println(EX3Ship);
        System.out.println(costa);
        System.out.println(MSC);
    }


}
