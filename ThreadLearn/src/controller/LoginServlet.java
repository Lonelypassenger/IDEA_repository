package controller;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:28 2019/9/5
 * @MODIFY:
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String usernamem,String password){
        try {
            usernameRef = usernamem;
            if (usernamem.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + "  passowrd=" + passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
