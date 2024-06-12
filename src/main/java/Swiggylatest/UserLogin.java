package Swiggylatest;
public class UserLogin {
    String userName = "bhagi4310";
    String password = "KKK@1234";

    public boolean loginValidate(String localuserName, String localPassword) {
        if ((localuserName.equals(userName)) && (localPassword.equals(password))) {
            System.out.println("loginSuccessful");
            return true;
        } else {
            System.out.println("login unsuccessful");
        }
    }
}