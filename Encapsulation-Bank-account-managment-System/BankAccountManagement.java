// 1️⃣ Bank Account Management
// Task: Create a BankAccount class that encapsulates account details.
// Requirements:
// Private fields: accountNumber (String), accountHolder (String), balance (double)
// Getters for all fields, setter only for accountHolder
// Methods: deposit(double amount) and withdraw(double amount)
// Validation: balance cannot go negative, deposit and withdraw must be positive


class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;
    BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance>=0?balance:0;
    }
     public String getaccountNumber(){
        return accountNumber;
    }
  
      public String getaccountHolder(){
        return accountHolder;
    }
    public double getbalance(){
        return balance;
    }
    public void setaccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
      
  public void deposit(double amount){
        if(amount<=0){
            System.out.println("Deposite Must be positive");
        }else{
            balance+=amount;
            System.out.println("Deposited amount"+amount+",New Balance:"+balance);
        }
    }
  public void withdrawl(double amount){
        if(amount<=0){
            System.out.println("withdral must be positive");
        }else if(amount>balance){
            balance-=amount;
            System.out.println("Insufficant Balance");
        }else{
            balance-=amount;
            System.out.println("Withdral amount:"+amount+",Remaining Balance:"+balance);
        }
    }
    
}
class BankAccountManagement{
    public static void main(String []args){
        BankAccount ba=new BankAccount("2211", "Akbar", 50000.0);
        System.out.println("Account Number: " + ba.getaccountNumber());
        System.out.println("Account Holder: " + ba.getaccountHolder());
        System.out.println("Balance: " + ba.getbalance());

        ba.deposit(10000);
        ba.withdrawl(20000.0);
        ba.setaccountHolder("Akbar");
        System.out.println("Updated Account Holder: " + ba.getaccountHolder());
    }
}