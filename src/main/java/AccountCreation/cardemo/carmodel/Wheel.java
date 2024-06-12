package AccountCreation.cardemo.carmodel;

public class Wheel {
    public String brand;
    public String wheelcap;
    public String noOfWheels;

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", wheelcap='" + wheelcap + '\'' +
                ", noOfWheels='" + noOfWheels + '\'' +
                '}';
    }

    public Wheel(String brand, String wheelcap, String noOfWheels) {
        this.brand = brand;
        this.wheelcap = wheelcap;
        this.noOfWheels = noOfWheels;
    }
}
