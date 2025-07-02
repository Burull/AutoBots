package BankAplication;

public class ProblemBank extends BankBase{
    double funts=300;

    public ProblemBank(long accountNumber, String client, String bankName) {
        super(accountNumber, client, bankName);
        this.funts = funts;
        BankBase.addToBase(this);
    }

    @Override
    public void withDraw(double amount) {
        funts-=amount;
        if (amount>150000){
            throw new IllegalArgumentException("You have limit 150000 to withdraw");
        }

    }

    @Override
    public void deposit(double amount) {
        funts+=amount;
        if (amount>200000){
            throw new IllegalArgumentException("You have limit 200000 to deposit");
        }
    }

    @Override
    public String toString() {
        return getClient()+"ProblemBank{" +
                "funts=" + funts +
                '}';
    }
}



