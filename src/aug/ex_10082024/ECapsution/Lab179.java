package aug.ex_10082024.ECapsution;
//Encapsulation fixed here
public class Lab179 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin = new VWOLogin1("admin","admin123");
        System.out.println(vwoLogin.getUsername()+", "+vwoLogin.getPassword());
        vwoLogin.setUsername("Naga");
        vwoLogin.setPassword("Naga1234"); //If we dont want the password to be edited then setter method should be removed for password
        System.out.println(vwoLogin.getUsername()+", "+vwoLogin.getPassword());
    }

}

 class VWOLogin1{
    private String username; //private variable cannot be called in other class
    private String password; //private variable cannot be called in other class

     //By adding getters and setters method for the private attributes of the class, the attributes can be viewed and edited outside the class

     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public VWOLogin1(String username, String password) {
     this.username = username;
     this.password = password;
    }
}

