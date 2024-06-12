package streamsDemo;

import java.util.Date;

public class AccountDetails {
    public int amount;
    public String discription;
    public Date trasactionDate;
    public String balanceAmount;
    public String type;

    public AccountDetails(int amount, String discription, Date trasactionDate, String balanceAmount, String type) {
        this.amount = amount;
        this.discription = discription;
        this.trasactionDate = trasactionDate;
        this.balanceAmount = balanceAmount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "amount=" + amount +
                ", discription='" + discription + '\'' +
                ", trasactionDate=" + trasactionDate +
                ", balanceAmount='" + balanceAmount + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
