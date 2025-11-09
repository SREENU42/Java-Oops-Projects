// ✅ 1️⃣ ATM Machine Simulator

// Concepts: Abstract class + concrete implementations

// Description:
// Create an abstract class ATM with abstract methods:
// checkBalance()
// withdraw(double amount)
// deposit(double amount)
// Create concrete class:
// SBIATM
// ICICIATM
// Both should implement rules:
// SBI — ₹10 service charge on withdrawal
// ICICI — No charge but limit withdrawal ≥ ₹1000
// Main:
// Allow user to interact with ATM using scanner input.
// Use-case for abstraction:
// Forces every bank class to follow required operations.
import java.util.Scanner;
abstract class ATM{
  protected double balance;
  ATM(double balance){
    this.balance=balance;
  }
  
  abstract void checkBalance();
  abstract void withdraw(double amount);
  abstract void deposit (double amount);
}
  

class SBIATM extends ATM{
  
  SBIATM (double balance){
    super(balance);
  }
  @Override
   void checkBalance(){
    System.out.println("SBI ATM Balance:"+balance);
  }
  void withdraw(double amount){
    double totalAmount=amount+10;
    if(totalAmount>balance){
      System.out.println("Insefficiant balance including 10 service Charge..");
  }else{
    balance-=totalAmount;
    System.out.println("Withdrawl Sucessfull..10 service fee Applied");
  }
  checkBalance();
  }
  @Override
  void deposit(double amount){
    if(amount<0){
      System.out.println("Deposit Must be Positive");
    }else{
      balance+=amount;
      System.out.println("Deposited Successfull...");
      
      checkBalance();
    }
  
  }
}
class ICICATM extends ATM{
  
  ICICATM (double balance){
    super(balance);
  }
  @Override
  void checkBalance(){
    System.out.println("Balance:"+balance);
  }
  
  @Override
  void withdraw(double amount){
    if(amount<1000){
      System.out.println("Minimum withdraw amount of ICIC 1000");
    }else if(amount>balance){
      System.out.println("Insufficient Funds");
    }else{
      balance-=amount;
      System.out.println("Remaining Balance:"+balance);
      checkBalance();
    }
  }
  @Override
  void deposit(double amount){
    balance+=amount;
    System.out.println("deposited Successfull..");
    checkBalance();
  }
}

public class ATMApp{
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    ATM atm;
    System.out.println("Enter the Bank ATM:");
    System.out.println("1,SBI ATM");
    System.out.println("2,ICIC ATM");
    
    System.out.println("Enter the choice:");
    int choice=sc.nextInt();
  
    
    
    if(choice==1){
      atm=new SBIATM(5000);
    }else if(choice==2){
      atm =new ICICATM(8000);
    }else{
      System.out.println("Ivalid choice..");
      return;
    }
    while (true){
      System.out.println("\n ATM Menu");
      
      System.out.println("1.check Balance");
      System.out.println("2.withdrawh");
      System.out.println("3.Deposit");
      System.out.println("Enter Your option:");
      int option=sc.nextInt();
      
      switch(option){
        case 1:
          atm.checkBalance();
          break;
          
        case 2:
            System.out.println("Enter withdraw amount:");
            double w=sc.nextDouble();
            atm.withdraw(w);
            break ;
            
        case 3:
            System.out.println("Enter deposit amount:");
            double d=sc.nextDouble();
            atm.deposit(d);
            break ;
            
        case 4:
            System.out.println("Thank for using Atm...");
            System.exit(0);
            default:
            System.out.println("Invalid option");
      }
    }
  }
}