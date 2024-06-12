package Bank;

 public class Test {
     public static void main(String[] args){
         Account account = new Account();
         account.accountNumber = 123456;
         account.balance = 1000;
         account.ifscCode = "SBI0002024";
         account.password = "4310";
         account.userName = "bhagi";
         AtmCard atmCard = new AtmCard();
         atmCard.cardNumber = "43104310";
         atmCard.cardNo = 4310;
         atmCard.validity = "3years";
         atmCard.account = account;
         ATM atm = new ATM();
         atm.location = "miyapur";
         atm.machineId = 4310;
         atm.balance = 3000;
         Transaction transaction = new Transaction();
         transaction.atm = atm;
         transaction.atmCard = atmCard;
         transaction.withDrawAmt = 2000;
         transaction.transactionID = 4310;
         System.out.println(transaction);
     }
 }