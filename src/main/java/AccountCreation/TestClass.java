package AccountCreation;

import CreateAccount.AccountService;
import CreateAccount.Address;

public class TestClass{
    public static void main(String[] args) {
        User user=new User();
        Address address=new Address();
        address.area="gnt";
        address.state="ap";
        address.city="gnt";
        user.firstName="bhagya";
        user.lastName="lakshmi";
        user.adharNo="1234";
        user.dob="18052003";
        user.address= address;
        AccountService accountService=new AccountService();
        Passbook passbook=accountService.createaccount(user);
        System.out.println(passbook);
    }
}
