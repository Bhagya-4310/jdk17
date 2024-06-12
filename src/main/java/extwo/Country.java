package extwo;

public class Country{
    public String pm;
    public String currency;
    public String language;
    State state;

    @Override
    public String toString() {
        return "Country{" +
                "pm='" + pm + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", state=" + state +
                '}';
    }
}
