package practice.bank_account;

import practice.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount acc0=new BankAccount(100L,"Bill Smith","Bank1",1,100);
        BankAccount acc1=new BankAccount(110L,"Bank1",1,100);
        BankAccount acc2=new BankAccount(110L,"Bank1",1);

        acc0.display();

        System.out.println(acc0.getOwner());
        System.out.println(acc0.getBalance());
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.withdraw(350);
        System.out.println(acc0.getBalance());
        acc0.withdraw(251);
        System.out.println(acc0.getBalance());
        acc0.withdraw(250);
        System.out.println(acc0.getBalance()+"\n");

        System.out.println(acc1.getOwner()+"\n");
        System.out.println(acc2.getOwner());
        System.out.println(acc2.getBalance());

    }
}
