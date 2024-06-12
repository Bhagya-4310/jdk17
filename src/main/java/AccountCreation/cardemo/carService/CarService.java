package AccountCreation.cardemo.carService;

import AccountCreation.cardemo.carmodel.*;

import java.util.ArrayList;
import java.util.List;

public class CarService{
    public void getcar(){
        Tank tank=new Tank("20",new Fuel("petrol"));
        Wheel wheel = new Wheel("alloy","black","4");
        Engine engine=new Engine("998cc",tank);
        Battery battery=new Battery("compresser","4","3","bluetooth");
        Interior interior=new Interior("5","4","powerSteering");
        Model model=new Model("grey","wagnor","");
        List<Wheel> wheels =new ArrayList<>();
        System.out.println(wheels.add(wheel));
        Car car=new Car(engine,battery,interior,model,wheels);
        System.out.println(car);
        System.out.println(wheel);
    }
}
