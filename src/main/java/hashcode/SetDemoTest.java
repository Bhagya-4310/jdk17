package hashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car();
        car1.name = "punch";
        Car car2 = new Car();
        car2.name = "punch";
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);
    }
}


      /*  Address addr=new Address();
        addr.area="kphb";
        addr.state="ap";
        Address del=new Address();
        del.area="kphb";
        del.state="ap";
        Set<Address> addset=new HashSet<>();
        addset.add(addr);
        addset.add(del);
        System.out.println(addset);
    }   */
