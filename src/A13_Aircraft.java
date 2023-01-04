public class A13_Aircraft {
    int number;
    int speed;

    public A13_Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double flight(int n){
        return n/speed;
    }


}
