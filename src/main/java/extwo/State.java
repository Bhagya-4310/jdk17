package extwo;

public class State {
    public String cm;
    public String language;
    public Country country;

    @Override
    public String toString() {
        return "State{" +
                "cm='" + cm + '\'' +
                ", language='" + language + '\'' +
                ", country=" + country +
                '}';
    }
}

