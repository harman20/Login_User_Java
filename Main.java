import java.util.*;

public class Main{
    private String password;
    private String userName;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name = sc.nextLine();
        System.out.println("Enter the password:");
        String pass = sc.nextLine();
        Main login = new Main(name,pass);
        if(login.validate())
            System.out.println("Valid user");
        else
            System.out.println("Invalid user");
      }    
        public Main(String name,String pass){
            setUserName(name);
            setPassword(pass);
        }
        public void setUserName(String name){
            this.userName = name;
        }
        public void setPassword(String pass){
            this.password = pass;
        }
        public String getUserName(){
            return userName;
        }
        public String getPassword(){
            return password;
        }
        public boolean validate(){
            String value=getUserName()+" "+getPassword();
            if(value.equals("harman 20012000h"))
               return true;
            else
               return false;
        }
}
