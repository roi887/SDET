package Exceptionhandeling;

import javax.security.auth.login.LoginException;

public class Throwcustom {
    public static void main(String[] args) throws Exception {
try {
    System.out.println(1/0);
}catch (ArithmeticException e) {

   throw new LoginException("Gandu ke bache u cant do like this");


}
    }
}
