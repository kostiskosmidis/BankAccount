public class Person {
    private String name;
    private int age;
    private BankAccount accounts;
    
    public Person() {
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, BankAccount accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
     
    public void setAge(int age) {
        this.age = age;
    }  

    public BankAccount getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount accounts) {
        this.accounts = accounts;
    }
    
}



