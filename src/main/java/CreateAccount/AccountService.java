package CreateAccount;

import AccountCreation.Passbook;
import AccountCreation.User;

import java.util.UUID;

public class AccountService{
    public Passbook createaccount(User user) {
        Passbook passbook = new Passbook();
        Address address=new Address();
        address.city="gnt";
        address.area="svn colony";
        address.state="ap";
        address.pinCode="1234";

        String name= user.firstName+user.lastName;
        passbook.userName =name;
        passbook.bankAddress=address;
        passbook.userAddress=user.address;
       // passbook.accountNumber="4310";
        passbook.accountNumber= UUID.randomUUID().toString();
        return passbook;
    }
}
