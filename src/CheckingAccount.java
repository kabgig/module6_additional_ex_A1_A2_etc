public class CheckingAccount extends Account {

    int debt = 0;

    public CheckingAccount(int balance) {
        super(balance);
    }

    void put(int n) {
        super.put(n);
    }

    void withdraw(int n) {
        debt = super.balance - n;
        super.withdraw(n);
    }

    public int getDebt() {
        if (debt >= 0) return 0;
        else return debt;
    }
}