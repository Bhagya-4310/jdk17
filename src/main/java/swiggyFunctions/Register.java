package swiggyFunctions;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
public class Register {
    String userName;
    String passWord;
    BiPredicate<String,String>register = (user,pass)->{
        pass="1234";
        user="bhagi";
        boolean register=true;
        if (user.equals(userName)&&pass.equals(passWord)){
            System.out.println("Login SuccessFully");
            Swiggy swiggy1 = new Swiggy();
            swiggy1.getRestaurant();
            System.out.println("Swigy : "+swiggy1.getRestaurant());
        }else {
            System.out.println("LoginFailed");
        }
        return register;
    };
    @Override
    public String toString() {
        return "Register{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
    public String getUserName() {
        return userName;
    }

    public String getPassWord(){
        return passWord;
    }
}