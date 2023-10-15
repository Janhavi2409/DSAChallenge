package ClassesAndObjects;

class User{
    String name;
    public User(){
        name = "Default";
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
    }
}
