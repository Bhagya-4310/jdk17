package AccountCreation.Loan;

public class LoanTestClass{
    public static void main(String[] args){
        LoanProcess loanProcess=new LoanProcess();
        User user=new User();
        user.AccountHolderName="bhagi";
        user.bankName="SBI";
        user.AccountNumber="SBI@4310";
        user.creditScore="9";
        user.surety="ashu";
        user.loanAmount=200000;
        user.ifscCode="4310";
       // loanProcess.loanSanction(user);
        System.out.println(loanProcess.loanSanction(user));
    }
}
