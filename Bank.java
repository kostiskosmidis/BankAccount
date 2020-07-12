public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount account1 = new BankAccount("Ethniki", 1);
       
       account1.deposit(500);
       account1.withdraw(100);
       
       BankAccount account2 = new BankAccount("Piraios",2);
       
      account2.deposit(900);
      account2.withdraw(200);
       
      account2.getTransactions();
      
      
      Person p1 = new Person("Bary",30,account1);
      
      System.out.println(p1.getAccounts().getAmount());
      
      
      Person p2 = new Person (p1.getName(),31,account1);
      
        System.out.println(p2.getAccounts().getAmount());
    }
    
   
}
