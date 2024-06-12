package SwiggiApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Restaurant {

        public String name;
        public List<Dish> menu;

        public Restaurant(String name){
            this.name = name;
            this.menu = new ArrayList<>();
        }
        public void addToMenu(Dish dish){
            menu.add(dish);
        }
     /*  public boolean dishAvail(String dishName){
            for (Dish dish :menu){
                if (dish.getName().equals(dishName)){
                    return true;
                }
            }
            return false;
        } */
     public boolean dishAvail(String dishName) {
          return menu.stream()
                  .anyMatch(dish -> dish.getName().equals(dishName));
      }
       /* public Dish getDish(String dishName){
            for (Dish dish : menu) {
                if (dish.getName().equals(dishName)){
                    return dish;
                }
            }
            return null;
        } */
       public Dish getDish(String dishName){
           return menu.stream()
                   .filter(dish -> dish.getName().equals(dishName))
                   .findFirst()
                   .orElse(null);
       }
        public String getName(){

           return name;
        }
        public boolean equals(Object obj){
            if (this == obj){
                return true;
            }
            if (this.getClass() != obj.getClass()){
                return false;
            }
            Restaurant restaurant=(Restaurant) obj;
            //type cast
            return this.menu.equals(restaurant.menu)&& this.name.equals(restaurant.name);
        }
}