package resturant;

public class Address {
    public String houseNo;
    public String area;

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                ", flatNo='" + flatNo + '\'' +
                '}';
    }

    public String street;
    public String pincode;
    public  String flatNo;


}
