package AccountCreation.card;

public class CardTestClass{
    public static void main(String[] args) {
        Cardholderinputs cardholderinputs = new Cardholderinputs();
        cardholderinputs.name = "bhagi";
        cardholderinputs.dob = "18052003";
        cardholderinputs.age = "20";
        cardholderinputs.AccountNo = "SBI@4310";
        cardholderinputs.ifscCode = "12345";
        cardholderinputs.salary="40000";
        CardService cardService=new CardService();
        CardDetails cardDetails=cardService.card(cardholderinputs);
        System.out.println(cardDetails.cardNumber+"   "+cardDetails.cvv);
    }
}