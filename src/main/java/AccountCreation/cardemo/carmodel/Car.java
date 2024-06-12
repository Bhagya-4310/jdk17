package AccountCreation.cardemo.carmodel;

import java.util.List;

public class Car {
   public Engine engine;
   public Battery battery;
   public Interior interior;
   public Model model;
   public List<Wheel> wheel;
   public Car(Engine engine, Battery battery, Interior interior, Model model, List<Wheel> wheel) {
      this.engine = engine;
      this.battery = battery;
      this.interior = interior;
      this.model = model;
      this.wheel = wheel;
   }
}