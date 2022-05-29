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
        if(previousTransaction > 0){
            System.out.println("Deposited: " +previousTransaction);
             }
            else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs (previousTransaction));
            }
            else{
                System.out.println("No Transaction occurred");
            }
        }
        //Function for calculating interest
        void calculateInterest(int years){
            double interestRate= 0.1825;
            double newBalance =( balance* interestRate*years)+ balance;
            System.out.println( "The interest rate is "+ ( 100*interestRate) + "%");
            System.out.println( "After" + years + "years, your balance will be: "+ newBalance);
        }

        //Function Showing the main menu
    void showMenu() {
        char option= '\0';
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome," + customerName + "!");
        System.out.println ("Your ID is :" + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. view previous Transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");
    }
    do {
        System.out.println();
        System.out.println("Enter an option: ");
        char option1 =scanner.next().charAt(0);
        option = Character. toUpperCase(option1);
        System.out.println();

        switch(option){
            //Case 'A' allows the user to check their account balance
            Case 'A':
            System.out.println("==================");
            System.out.println("Balance= $" + balance);
            System.out.println("==================");
            System.out.println();
            break;
        }
        //Case 'B' allows the user to deposit money into the account
        Case 'B'

    }
}
