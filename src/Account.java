public class Account {

    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    void withdraw(int n){
        balance -= n;
        if (balance < 0)
            balance = 0;
    }

    void put(int n){
        balance += n;
    }

    public int checkBalance(){
        return balance;
    }
}
