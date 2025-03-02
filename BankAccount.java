public class BankAccount {
    private String Name;
    private int AccNo, CurrBal;

    public BankAccount(String Name, int AccNo, int CurrBal) {
        this.Name = Name;
        this.AccNo = AccNo;
        this.CurrBal = CurrBal;
        System.out.println("The customer is: " + this.Name);
    }

    public int deposit(int dAmt) {
        CurrBal += dAmt;
        return CurrBal;
    }

    public void withdraw(int wAmount) {
        if (wAmount <= CurrBal) { // Allowing withdrawal if balance is equal
            CurrBal -= wAmount;
            System.out.println("Remaining Balance: " + CurrBal);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount Umesh = new BankAccount("UMESH CHANDRA REDDY", 1500, 10000);
        Umesh.withdraw(9000); // Should print "Insufficient funds"
        Umesh.withdraw(5900); // Should print remaining balance
        int FinalAmount = Umesh.deposit(5000);
        System.out.println("Final Balance: " + FinalAmount);
    }
}
