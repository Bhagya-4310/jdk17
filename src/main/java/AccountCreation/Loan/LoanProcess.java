package AccountCreation.Loan;

public class LoanProcess {
    public LoanDetails loanSanction(User user){
        LoanDetails loanDetails=new LoanDetails();
        loanDetails.loanHolderName=user.AccountHolderName;
        loanDetails.loanAmount=user.loanAmount;
        loanDetails.interestPerYear="1%";
        loanDetails.mothlyEmi="2400";
        loanDetails.surety=user.surety;
        loanDetails.AccountNumber=user.AccountNumber;
        loanDetails.ifscCode= user.ifscCode;
        loanDetails.creditScore=user.creditScore;
        System.out.println("loanAmount:"+loanDetails.loanAmount+"  "+loanDetails.mothlyEmi+"  "+loanDetails.interestPerYear);
        return loanDetails;
    }
}
