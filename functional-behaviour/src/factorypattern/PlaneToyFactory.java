package factorypattern;

public class PlaneToyFactory extends ToyFactory {
    @Override
    public IToy create() {
        return new PlaneToy();
    }
}
