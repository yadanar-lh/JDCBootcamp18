public class User {
    private String name;
    public User(){
        name = "Guest User";
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
