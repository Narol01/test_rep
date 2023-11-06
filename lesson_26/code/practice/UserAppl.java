package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail.com","MyP@ssw0rd");
        System.out.println(user);//print user

        user.setEmail("peter@gmail.com");
        user.setPassword("MyP@ssw0rd");
        System.out.println(user);
    }
}
