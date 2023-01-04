public class Deposit extends Account {

    private int period;
    private double percent;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public double withdraw() {
        if (period <= 0) {
            double depositBalance = super.balance + (super.balance / 100 * percent);
            super.withdraw(balance);
            return depositBalance;
        }
        else return 0;
    }

    public void waitDays(int n){}
    public boolean isPeriodExpired() {
        if (period <= 0) return true;
        else return false;
    }
}
