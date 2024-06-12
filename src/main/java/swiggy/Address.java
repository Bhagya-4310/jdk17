package swiggy;

public class Address{
    public String name;
    public String mobileNo;
    public String city;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
