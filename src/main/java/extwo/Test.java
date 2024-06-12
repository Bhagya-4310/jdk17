package extwo;

public class Test{
    public static void main(String[] args) {
        Country country=new Country();
        country.currency="rupee";
        country.pm="modi";
        country.language="hindi";

        State state=new State();
        state.cm="ysr";
        state.language="telugu";
        state.country=country;
      //  country.state=state;

        System.out.println(country);
        System.out.println(state);
    }
}
