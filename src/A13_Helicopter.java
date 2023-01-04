public class A13_Helicopter extends A13_Aircraft {
    int screwDiameter;
    int power;

    public A13_Helicopter(int number, int speed, int screwDiameter, int power) {
        super(number, speed);
        this.screwDiameter = screwDiameter;
        this.power = power;
    }
}
