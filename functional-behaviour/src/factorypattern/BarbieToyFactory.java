package factorypattern;

public class BarbieToyFactory extends ToyFactory{
    @Override
    public IToy create() {
        return new BarbieToy();
    }
}
