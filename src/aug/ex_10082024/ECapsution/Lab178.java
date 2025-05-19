package aug.ex_10082024.ECapsution;
//Encapsulation starts here
public class Lab178 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","admin123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "new123"; //Any user can change the password
        System.out.println(vwoLogin.password);
    }
}
 class VWOLogin{
    public String username;
    public String password;
    public VWOLogin(String username, String password) {
     this.username = username;
     this.password = password;
    }
}

