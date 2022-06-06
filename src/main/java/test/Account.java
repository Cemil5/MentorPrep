package test;

public class Account {
    int p;
    String name = "Mike";

    public void m3() {
        Account account2 = new Account();
     //   account.name="John";
        System.out.println("m3 : " + account2);
    }

    public void m2(int b) {
        boolean c;
        m3();
    }

    public void m1() {
        int x = 20;
        m2(10);
    }

    public void m1(Account account) {
        Account account2 = new Account();
        //   account.name="John";
        System.out.println("m1 : " + account2);
        System.out.println(account2.name == account.name);
    }

    @Override
    public String toString() {
        return "Account{" +
                "p=" + p +
                ", name='" + name + '\'' +
                '}';
    }
}
class AccountTest {

    public static void main(String[] args) {
        Account account = new Account();
        int a = 5;
        account.m1(account);
        System.out.println("main : " + account);
    }
}
