public class CheckingAccount extends Account{

    public CheckingAccount(int balance) {
        super(balance);
    }

    public int getDebt(){
        if (balance < 0) return balance;
        else return 0;
    }

    void withdraw(int n){
        balance -= n;
    }
}
