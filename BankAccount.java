import java.util.ArrayList;
public class BankAccount {
    private int number;
    private double amount;
    private String name;
    boolean active;
    private static int accountsOpened;
    private ArrayList<String> transactions;
    
    public BankAccount(){
        accountsOpened++;
        active = true;
        transactions = new ArrayList();
        transactions.add("Created BankAccount with balance $0");
    
    }
    
    public BankAccount(String name, int number){
    this();
    this.name = name;
    this.number=number;}
    
    public BankAccount(String name,int number,double amount){
    
    this(name,number);
    
    this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getTransactions() {
        
        for(int i = 0;i<transactions.size();i++){
            System.out.println(transactions.get(i));
        }
        
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public static int getAccountsOpened() {
        return accountsOpened;
    }

    public static void setAccountsOpened(int accountsOpened) {
        BankAccount.accountsOpened = accountsOpened;
    }
    
    
    public void deposit(double money){
       
        if (money>0) {
          amount = amount + money;
          transactions.add("You added $"+money);
         }  
    }
    
    public void withdraw(double money){
        
       if(money>0 && (amount-money)>0){
            amount =amount - money;
           transactions.add("You removed $"+ money);  
       }
    }  
    
   }

