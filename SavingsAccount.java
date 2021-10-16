class SavingsAccount {
    private double balance;
    public static double interestRate = 0;
    
    public SavingsAccount(){
        balance = 0;
    }
    public static void setInterestRate(double newRate){
        interestRate = newRate;
    }
    public static double getInterestRate(){
        return interestRate;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+= amount;
    }
    public double withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
        }
        else{
            amount = 0;
        }
        return amount;
    }
    public void addInterest(){
        double interest = getBalance()*getInterestRate();
        balance+=interest;
    }
    public static void showBalance(SavingsAccount account){
        System.out.println ("Your balance is " + account.getBalance());
    }
}
