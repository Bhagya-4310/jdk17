package streamsDemo;

import java.util.*;

public class AccountService {
    public Map<Account,Account> getAccountSummery() {
        List<AccountDetails> accountDetails=new ArrayList<> ();
        AccountDetails accountDetails1=new AccountDetails(10000,"groceries",new Date(),"2000","d");
        AccountDetails accountDetails2=new AccountDetails(20000,"shopping",new Date(),"1000","c");
        AccountDetails accountDetails3=new AccountDetails(30000,"shopping",new Date(),"1000","d");
        accountDetails.add(accountDetails1);
        accountDetails.add(accountDetails2);
        accountDetails.add(accountDetails3);
        Address address=new Address("guntur","2-5-185","udyoganagar","53200");
        User user=new User("bhagi","guntur","18-05-2003","SBI");
        Account account=new Account();
        account.accountNo=4310;
        account.userName="bhagi";
        account.address=address;
        account.balance="10000";
        account.ifscCode="1234";
        account.accountDetails=accountDetails;

        Map<Account,Account> accountaccountMap=new HashMap<>();
        accountaccountMap.put(account,account);
        System.out.println("mapsize"+accountaccountMap.size());
        return accountaccountMap;
    }
}