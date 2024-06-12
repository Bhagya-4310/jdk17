package functionDemo;

import javax.naming.Name;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
public class LengthofString{
    Function<String,String> toUpperCase=(fullName) ->{
        String name=fullName.toUpperCase();
        return name;
    };
   BiFunction<String,String,Integer> lengthOfStrings=(Surename,name)->{
       String Name=Surename+name;
       System.out.println(Name);
       return Name.length();
   };
   public String uppercase(String fullName){
       String upperCase=fullName.toUpperCase();
       return upperCase;
   }
   public String Stringlength(String SureName,String name){
        String Name=SureName+name;
        System.out.println("length :"+Name.length());
        return Name;
    }
public static void main(String[] args) {
    LengthofString lengthofString=new LengthofString();
    String toUpperCase=lengthofString.toUpperCase.apply("bhagi");
    System.out.println(toUpperCase);
    String uc=lengthofString.uppercase("bhagi");
    System.out.println(uc);
    lengthofString.Stringlength("akkiraju","bhagi");
    int size=lengthofString.lengthOfStrings.apply("kondapalli","sudheer");
    System.out.println("length= "+size);
}
}