import java.util.*;
class RunSavingsAccount {
    public static void main(String args[]){
        SavingsAccount savings = new SavingsAccount();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Interest Rate: ");
        SavingsAccount.setInterestRate(scanner.nextDouble());

        System.out.print("Enter deposit amount: ");
        savings.deposit(scanner.nextDouble());
        
        SavingsAccount.showBalance(savings);
        
        System.out.print("Press D for another deposit or W for withdraw: ");
        String userInput = scanner.next();
        
        if(userInput.equalsIgnoreCase("D")){
            System.out.print("Enter deposit amount: ");
            savings.deposit(scanner.nextDouble());
        }
        else if(userInput.equalsIgnoreCase("W")){
            System.out.print("Enter withdraw amount: ");
            savings.withdraw(scanner.nextDouble());
        }
        else{
            System.out.print("Invalid input! Please repeat your transaction, Thank you.");
        }
        if(savings.getBalance()>1000){
            savings.addInterest();
        }
        System.out.println("Your new balance is " + savings.getBalance());
    }
}
