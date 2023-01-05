public class EX5_Driver extends EX5_Employee {
    String carBrand;

    public EX5_Driver(String name, int age, String carBrand) {
        super(name, age, "Driver");
        this.carBrand = carBrand;
    }
}
