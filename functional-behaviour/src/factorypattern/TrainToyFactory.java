package factorypattern;

public class TrainToyFactory extends ToyFactory{
    @Override
    public IToy create() {
        return new TrainToy();
    }
}
