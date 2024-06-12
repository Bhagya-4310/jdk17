package functionDemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Addition{
    Function<String,String> toLowerCase=(name)->{
      return name.toLowerCase();
    };
    BiFunction<Integer,Integer,Double> addit=(a,b)->{
        double c=a+b;
        return  c;
    };
    public int addition(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Addition addition=new Addition();
        String lc=addition.toLowerCase.apply("BHAGi");
        System.out.println(lc);
       int add= addition.addition(200000,300000);
        System.out.println(add);
        double c =addition.addit.apply(200000,300000);
        System.out.println(c);
    }
}