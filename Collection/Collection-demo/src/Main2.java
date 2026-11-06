
public class Main2 {
    static void main() {
        Employee e1= new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = e1;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        e1.department = "HR";
        e1.name = "John";
        e2.department = "HR";
        e2.name = "John";

        boolean isSame = e1.equals(e2);
        System.out.println("e1 and e2 are same : " + isSame);
    }
}


