package functionDemo;

import java.util.function.BiFunction;
public class FunctionDemoTest {


    BiFunction<String,String,String> concatfun=(firstName,lastName)->{
        String fullName=firstName+lastName;
        System.out.println("Name  "+fullName);
        return fullName;
    };
    public String concatName(String firstName,String lastName){
        String fullName=firstName+lastName;
        System.out.println("Name  "+fullName);
        return fullName;
    }
    public static void main(String[] args){
FunctionDemoTest functionDemoTest=new FunctionDemoTest();
functionDemoTest.concatName("Neoteric","method");
functionDemoTest.concatfun.apply("Neoteric","method");
    }
}