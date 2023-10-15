package ClassesAndObjects;

class User1{
    String name;
    public User1(String name){
        this.name = name;
    }
}
public class ParameterizedConstructor {

    public static void main(String[] args) {
        User1 user = new User1("Janhavi");
        System.out.println(user.name);
    }
}
