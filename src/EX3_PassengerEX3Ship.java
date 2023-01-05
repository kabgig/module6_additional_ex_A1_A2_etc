public class EX3_PassengerEX3Ship extends EX3_Ship {

    int maxPassengerCapacity;

    public EX3_PassengerEX3Ship(String name, int year, int maxPassengerCapacity) {
        super(name, year);
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " и способно принять на борт " +
                maxPassengerCapacity + " пассажиров";
    }
}
