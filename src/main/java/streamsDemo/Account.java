package streamsDemo;

import java.util.List;
import java.util.Objects;

public class Account {
    public int accountNo;
    public String userName;
    public String balance;
    public String ifscCode;
    public Address address;

    List<AccountDetails> accountDetails;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNo == account.accountNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }


}