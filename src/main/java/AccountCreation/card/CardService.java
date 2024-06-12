package AccountCreation.card;

import java.util.Date;

public class CardService{
    public CardDetails card(Cardholderinputs cardholderinputs){
        CardDetails cardDetails=new CardDetails();
        cardDetails.name="BhagyaLakshmi";
        cardDetails.cardNumber="12345678";
        cardDetails.cvv="234";
        cardDetails.expiryDate=new Date();
        cardDetails.cardLimit=200000;
        BankDetails bankDetails=new BankDetails();
        bankDetails.AccountNo=cardholderinputs.AccountNo;
        bankDetails.ifscCode=cardholderinputs.ifscCode;
        return cardDetails;
    }
}
