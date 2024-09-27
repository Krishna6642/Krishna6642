class User{
    private int userId;
    private String username;
    private String Email;
    private String password;

    public User(int userId, String username,String Email,String password){
        this.userId = userId;
        this.username = username;
        this.Email = Email;
        this.password = password;

    }
    public int getuserId(){
        return userId;
    }
    public String getusername(){
        return username;
    }
    public String getEmail(){
        return Email;
    }
    public String getpassword(){
        return password;
    }

}
class Login{
    private String username;
    private String password;

    public Login(String username, String password){
        this.password = password;
        this.username = username;
    }
    public boolean authenticate(User user){
        return this.username.equals(user.getusername());
    }
         

}
public class baking {

    public static void main(String[] args) {
        User Krishna = new User(12, "krishna", "krishnapatil6642@gmail.com", "GOLD@123");
        User Pragya = new User(13, "PragyaKrishna", "pragyar960@gmail.com", "Krishna@1234");
       
        Login login = new Login("PragyaKrishna","Krishna@1234");
        // login.authenticate(Krishna);

    if(login.authenticate(Pragya)){
        System.out.println("Login successful for user:"+Pragya.getusername());
    }else{
        System.out.println("Login Failed for user:"+Pragya.getusername());
    }
    
    
    }
}
