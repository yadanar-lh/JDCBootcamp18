import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReference {
    static void main() {
        Supplier<User> defaultUser = () -> new User(); //lambda
        defaultUser = User::new; //method reference
        System.out.println("Default User : " + defaultUser.get().getName());

        Function<String,User> adminUser = s -> new User(s); //lambda version
        adminUser = User::new;
        User user = adminUser.apply("Min Min (Admin)");
        System.out.println("Admin User : " + user.getName());
    }
}
