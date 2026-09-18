public class BankAccount {
    private String ownerName;
    private int accountNumber;
    private double balance;


    public BankAccount(String name , int number , double balance){
        this.ownerName = name;
        this.accountNumber = number;
        this.balance = balance;

    }

    public double deposit (double deposit){
        if (deposit > 0 ){
            balance += deposit;
        }else {
            System.out.println("Error: Invalid deposit amount");

        }
        return balance  ;
    }
    public double withdrawal (double withdrawal){
        if (withdrawal >0 && withdrawal <= balance){
            balance -=withdrawal;
        }else {
            System.out.println("Error: Invalid amount");
        }
        return balance ;
    }
    public void printfull(){
        System.out.println(ownerName);
        System.out.println(accountNumber);
        System.out.println(balance);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
