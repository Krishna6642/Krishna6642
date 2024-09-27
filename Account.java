// Source code is decompiled from a .class file using FernFlower decompiler.
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Account {
   private String AccountNumber;
   private String name;
   private double balance;
   private List<Transaction> transactionHistory;

   public Account(String var1, String var2, double var3) {
      this.AccountNumber = var1;
      this.balance = var3;
      this.name = var2;
      this.transactionHistory = new ArrayList();
   }

   public String getAccountNUmber() {
      return this.AccountNumber;
   }

   public String getname() {
      return this.name;
   }

   public double getbalance() {
      return this.balance;
   }

   public void deposit(int var1) {
      this.balance += (double)var1;
      Transaction var2 = new Transaction("Deposit", (double)var1, LocalDate.now().toString());
      this.transactionHistory.add(var2);
   }

   public void withdraw(int var1) {
      if (this.balance < (double)var1) {
         System.out.println("Insufficient Balance");
      } else {
         this.balance -= (double)var1;
         System.out.println("WITHDRAW SUCCESSFULLL");
         Transaction var2 = new Transaction("Withdraw", (double)var1, LocalDate.now().toString());
         this.transactionHistory.add(var2);
      }

   }

   public void printTransactionHistory() {
      System.out.println("Transaction History for Account: " + this.AccountNumber);
      Iterator var1 = this.transactionHistory.iterator();

      while(var1.hasNext()) {
         Transaction var2 = (Transaction)var1.next();
         var2.printTransaction();
      }

   }

   public void checkBalance() {
      System.out.println("YOUR BALANCE IS:" + this.balance);
   }
}
