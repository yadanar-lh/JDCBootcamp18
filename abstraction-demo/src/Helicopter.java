public class Helicopter extends Vehicle{
    @Override
    public void go() {
        System.out.println("I am flying.");
    }

    public Helicopter(String vehicleType) {
        super(vehicleType);
    }
}
