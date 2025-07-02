package BankAplication;

public class Demo {
    public static void main(String[] args) {
        Bank Burul = new OptimaBank(123456, "Burul","OptimaBank");
        System.out.println(Burul);
        BankBase Ernar = new OptimaBank(123458, "Ernar","OptimaBank");
        System.out.println(Ernar);
        Burul.deposit(5000);
        System.out.println(Burul);
        Bank Madina = new ProblemBank(123459, "Madina","ProblemBank");
        Bank Altynai = new ProblemBank(123410, "Altynai","ProblemBank");
        Bank Janar = new OptimaBank(123411, "Janar","OptimaBank");
        Bank Kairat = new OptimaBank(123412, "Kairat","OptimaBank");
        Bank Ulugbek = new ProblemBank(123413, "Ulugbek","ProblemBank");

        Bank.transaction(Burul, Ernar, 1000);
        System.out.println(Burul);
        System.out.println(Ernar);
        System.out.println(Madina);
        System.out.println(BankBase.allBanksClients);

        BankBase.filterByBank("OptimaBank");
        BankBase.filterByBank("ProblemBank");

        BankBase.filterByBank();
    }
}
