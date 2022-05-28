public class Account {
    
     //class variables
 int balance;
 int previousTransaction;
 String CustomerName;
 String CustomerID;

 //Class constructor
 Account (String cname, String cid) {
     CustomerName= cname;
     CustomerID= cid;
 }
 //Function for depositing money
 void deposit(int amount){
     if(amount!=0)
     {
         balance= balance + amount;
         previousTransaction= amount;
     }
    }
     //Function for withdrawing money
 void withdraw(int amount){
     if (amount!=0){
        balance= balance-amount;
        previousTransaction= -amount;
     }
     }
    //function showing previous transaction
    void getPreviousTransaction(){

    }
    public void showMenu() {
        
    }
}
