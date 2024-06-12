package swiggyFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Restaurant{
    List<Menu>menuList;
    String restaurantNames;
    public List<Menu> getMenuList(){
        Menu menu = new Menu();
        System.out.println("Menu = "+menu.getDishesList());
        return menuList;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(menuList, that.menuList) && Objects.equals(restaurantNames, that.restaurantNames);
    }
    @Override
    public int hashCode(){

        return Objects.hash(menuList, restaurantNames);
    }
    @Override
    public String toString(){
        return "Restaurant{" +
                "menuList=" + menuList +
                ", restaurantNames='" + restaurantNames + '\'' +
                '}';
    }
}