package functionDemo;

import Mapping.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiSupplierDemoTest {
    Supplier<List<Restarurent>> restarurentList=() ->{
        List<Restarurent> list=new ArrayList<>();
        Restarurent restarurent=new Restarurent();
        restarurent.name="mefil";
        list.add(restarurent);
        Restarurent restarurent1=new Restarurent();
        restarurent1.name="mandi";
        list.add(restarurent1);
        return list;
    };
    public List<Restarurent> getRestarentList(){
        List<Restarurent> list=new ArrayList<>();
        Restarurent restarurent=new Restarurent();
        restarurent.name="kfc";
        list.add(restarurent);
        Restarurent restarurent1=new Restarurent();
        restarurent1.name="manddi";
        list.add(restarurent1);
        return list;
    }
    Consumer<List<Restarurent>> restaruentConsumer=(abc)->{
      abc.stream().forEach(test -> {
          System.out.println();
      });
    };

    public static void main(String[] args) {
        BiSupplierDemoTest biSupplierDemoTest=new BiSupplierDemoTest();
        List<Restarurent> funcList= biSupplierDemoTest.restarurentList.get();
        List<Restarurent> methodList=biSupplierDemoTest.getRestarentList();
        System.out.println("finclist" +funcList);
        System.out.println("methodlist"+methodList);
        biSupplierDemoTest.restaruentConsumer.accept(funcList);
    }
}
