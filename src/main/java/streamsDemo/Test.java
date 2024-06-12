package streamsDemo;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class Test {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Map<Account, Account> accountMap = accountService.getAccountSummery();
        Account account = new Account();
        account.accountNo = 4310;
        Account fullAccount = accountMap.get(account);
        System.out.println(fullAccount.accountNo);
        Predicate<AccountDetails> creditTypePredicate = (accountDetails -> accountDetails.type.equals("c"));
        //streams ,filters,collect
        List<AccountDetails> creditAccountDetails = fullAccount.accountDetails.stream()
                .filter(abc -> creditTypePredicate.test(abc))
                .collect(Collectors.toList());
        System.out.println("Stream Credit account details" + creditAccountDetails);


        List<AccountDetails> normalForLoopCreditAccountDetails = new ArrayList<>();
        for (int i = 0; i < fullAccount.accountDetails.size(); i++) {
            if (fullAccount.accountDetails.get(i).type.equals("c"));
            {
                normalForLoopCreditAccountDetails.add(fullAccount.accountDetails.get(i));
            }
        }
        //groupingBy
        Map<String, Double> groupBytypeSum = fullAccount.accountDetails.stream()
                .collect(groupingBy(AccountDetails::getType,summingDouble(AccountDetails::getAmount)));
        System.out.println(groupBytypeSum);

        Map<String, Double> groupBynormalMap = new HashMap<String, Double>();
        double creditSum = 0;
        double debitSum = 0;
        for (int i = 0; i < fullAccount.accountDetails.size(); i++) {
            if (fullAccount.accountDetails.get(i).type.equals("c")) {
                AccountDetails details = fullAccount.accountDetails.get(i);
                creditSum = creditSum + details.getAmount();
            } else if (fullAccount.accountDetails.get(i).type.equals("d")) {
                AccountDetails detail = fullAccount.accountDetails.get(i);
                debitSum = debitSum + detail.getAmount();
               // System.out.println(groupBynormalMap);
            }
        }
    }
}