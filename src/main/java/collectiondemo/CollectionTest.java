package collectiondemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class CollectionTest {
    public String payment = "phonepay";
    public int amount = 2000;

    @Override
    public String toString() {
        return "CollectionTest{" +
                "payment='" + payment + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        CollectionTest collectionTest = new CollectionTest();
        List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant1 = new Restaurant();
        restaurant1.name = "mefil";
        Restaurant restaurant2 = new Restaurant();
        restaurant2.name = "mefil2";
        //insertion and retrival are same
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        // restaurants.add(null);
//retrival
        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant res = restaurants.get(i);
            System.out.println("  normal forloop : " + res.name);
        }
        //iterator which we can do this using for loop as in the above
        Iterator<Restaurant> restaurantIterator = restaurants.iterator();
        for (; restaurantIterator.hasNext(); ) {
            Restaurant resto = restaurantIterator.next();
            System.out.println(resto.name);
        }
        //consumer
        restaurants.forEach(restaurant -> System.out.println(restaurant.name));


        //bipredicate which will have two inputs
        BiPredicate<String, Integer> biPredicate = (paymentt, amount) -> paymentt.equals("phonepay") && amount == 2000;
        System.out.println(biPredicate.test(collectionTest.payment, collectionTest.amount));
        //predicate will have one input
        Predicate<String> predicate = (paymenttt) -> paymenttt.equals("phonepay");
        System.out.println(predicate.test(collectionTest.payment));
    }
}