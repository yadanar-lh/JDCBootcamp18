package factorypattern;

public class RobotToyFactory extends ToyFactory{
    @Override
    public IToy create() {
        return new RobotToy();
    }
}
