package hashcode;

public class Car{
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

   public String name;
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Car car=(Car) o;
        return this.name.equals(car.name);
    }
    public int hashCode(){
        return this.name.hashCode();
    }
    }
