package swiggyFunctions;
import java.util.List;
import java.util.function.Predicate;
public class Menu {
    List<Dishes> dishesList;
   public List<Dishes> getDishesList(){
       Dishes dishes= new Dishes();
       dishes.dishesNames="Pizza";
       dishes.price=300.0;
       Dishes chicken= new Dishes();
       chicken.dishesNames="Chicken";
       chicken.price=300.0;
       Dishes desserts=new Dishes();
       desserts.dishesNames="Desserts";
       desserts.price=120.0;
       dishesList.add(chicken);
       dishesList.add(dishes);
       dishesList.add(desserts);
       return this.dishesList;
   }
    @Override
    public String toString() {
        return "Menu{" +
                "dishesList=" + dishesList +
                '}';
    }
}