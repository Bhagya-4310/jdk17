package resturant;

public class User {
    public String email;
    public String mobileNumber;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address=" + address +
                '}';
    }

    Address address;


}
