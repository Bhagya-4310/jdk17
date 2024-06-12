package AccountCreation.mapping;

import java.util.HashMap;
import java.util.Map;

public class Senoriaone {
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.shopName="bhagi";
        Map<Shop,String> shopMap=new HashMap<>();
        shopMap.put(shop,"bhagi");
        shopMap.get(shop);
        System.out.println(shopMap);
    }
}
