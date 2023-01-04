public class A11_CheckingAccount extends A11_Account {

    public A11_CheckingAccount(int balance) {
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