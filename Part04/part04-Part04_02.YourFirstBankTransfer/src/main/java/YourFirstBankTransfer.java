
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mat = new Account("Matthews account", 1000);
        Account mine = new Account("My account", 0);
        mat.withdrawal(100);
        mine.deposit(100);
        System.out.println(mat.toString());
        System.out.println(mine.toString());
        
    }
}
