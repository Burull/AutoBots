package BankAplication;

public interface Bank {


    void withDraw(double amount);
// spisanie s balansa


    void deposit (double amount );
//popolnenie



   static void transaction (Bank sender,Bank recipient,double amount){
       sender.withDraw(amount);
       recipient.deposit(amount);
   }

//javajava




}
