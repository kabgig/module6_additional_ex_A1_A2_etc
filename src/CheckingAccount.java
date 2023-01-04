public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    void withdraw(int n) {
        balance -= n;
    }

    public int getDebt() {
        return balance < 0 ? -balance : 0;
    }
}