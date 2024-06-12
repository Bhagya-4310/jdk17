package SwiggiApp;
import java.util.Optional;
public class SwiggyService{

        public void swiggyService() {
            Swiggy swiggy = new Swiggy();
            Dish biryani = new Dish("Biryani", 160.00);
            Dish chicken65 = new Dish("Chicken65", 150.00);
            Dish rolls = new Dish("Rolls", 100.00);
            Restaurant restaurant1 = new Restaurant("Mehfil");
            restaurant1.addToMenu(biryani);
            restaurant1.addToMenu(chicken65);
            Restaurant restaurant2 = new Restaurant("Roll Zone");
            restaurant2.addToMenu(rolls);
            swiggy.addRestaurant(restaurant1);
            swiggy.addRestaurant(restaurant2);
            String restaurantName = "Mehfil";
            Restaurant restaurant = RestaurantService.findRestaurant(swiggy, restaurantName);
            String dishName = "Rolls";
           Dish dish =DishService.findDish(restaurant,dishName);
           /* if (restaurant != null && dish != null) {
                System.out.println("Ordered " + dish.getName() + " from " + restaurant.getName() +
                        " for Rs :" + dish.getPrice());
            } else {
                System.out.println("Sorry, could not place the order.");
            }
        } */
            Optional.ofNullable(restaurant)
                    .filter(r -> dish != null)
                    .ifPresentOrElse(
                            r -> System.out.println("Ordered " + dish.getName() + " from " + r.getName() + " for Rs :" + dish.getPrice()),
                            () -> System.out.println("Sorry, could not place the order."));
        }
    }