import java.util.Scanner;


    class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException( String message){
        super(message);
    }
}
    class InvalidAmountException extends Exception{
        public InvalidAmountException(String message){
            super (message);
        }
    }
    
     class bank{
        private double balance;
        bank(double balance){
            this.balance=balance;
        }
        public void deposit(double amount)
            throws InvalidAmountException{
                if(amount<=0){
                  throw new InvalidAmountException("Despot must be postive");  
                }
                balance+=amount;
                 System.out.println("Deposited: " + amount);
            }
        
        public void withdraw(double amount)
            throws InvalidAmountException,InsufficientBalanceException{
                if(amount<=0){
                    throw new InvalidAmountException("amount ahould be postive");

                }
                if(amount>balance){
                    throw new InsufficientBalanceException("Insufficient balance");
                }

                balance-=amount;
                  System.out.println("Withdrawn: " + amount);
            }
            public double getbalance() {
                return balance;
            }
        }
        public class bankAccount{
            public static void main(String[] args){
                bank account =new bank(5000);
                try{
                    account.deposit(300);
                    account.withdraw(500);
                }catch(InvalidAmountException e){
                    System.out.println(e.getMessage());
                }catch(InsufficientBalanceException e){
                    System.out.println(e.getMessage());
                }
            }
        }

     
    

    

