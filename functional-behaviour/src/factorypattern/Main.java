package factorypattern;

public class Main {
    static void main() {
        ToyFactory factory = new BarbieToyFactory();
        IToy toy = factory.create();
        System.out.println(toy.makeToy());
    }
}
