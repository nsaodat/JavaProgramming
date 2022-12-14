package day31_CustomClass_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Anna Hebbert", 12254799);
        System.out.println(account1); //BankAccount{accountHolder='Anna Hebbert', accountNumber=12254799, balance= $0.0}

        account1.deposit(5000);
        System.out.println(account1);//BankAccount{accountHolder='Anna Hebbert', accountNumber=12254799, balance= $5000.0}
        account1.withdraw(500);
        System.out.println(account1);//BankAccount{accountHolder='Anna Hebbert', accountNumber=12254799, balance= $4500.0}
        account1.checkBalance(); // Your available balance is $4500.0
        System.out.println("--------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(10000); // Your available balance is $10000.0

        account2.checkBalance();



    }
}