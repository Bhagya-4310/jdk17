package SwiggiApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Swiggy {
        public List<Restaurant> restaurants;

        public Swiggy() {
            this.restaurants = new ArrayList<>();
        }

       /* public void addRestaurant(Restaurant restaurant) {
            restaurants.add(restaurant);
        } */
       public void addRestaurant(Restaurant restaurant) {
           restaurants = Stream.concat(restaurants.stream(), Stream.of(restaurant))
                   .collect(Collectors.toList());
       }

        public boolean restaurant(String restaurantName) {
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equals(restaurantName)) {
                    return true;
                }
            }
            return false;
        }
       /* public Restaurant getRestaurant(String restaurantName) {
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equals(restaurantName)) {
                    return restaurant;
                }
            }
            return null;
        }*/
       public Restaurant getRestaurant(String restaurantName) {
           return restaurants.stream()
                   .filter(restaurant -> restaurant.getName().equals(restaurantName))
                   .findFirst()
                   .orElse(null);
       }
    }