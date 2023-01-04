public class Deposit extends Account {

    private int period;
    private double percent;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public double withdraw() {
        if (isPeriodExpired()) {
            double depositBalance = (double) super.balance + ((double) super.balance / 100 * percent);
            super.balance = 0;
            return depositBalance;
        } else return 0;
    }

    public void waitDays(int n) {
        period -= n;
    }

    public boolean isPeriodExpired() {
        return period <= 0;
    }
}
