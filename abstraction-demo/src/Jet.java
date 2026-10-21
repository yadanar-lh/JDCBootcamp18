public class Jet extends Vehicle{

    @Override
    public void go() {
        System.out.println("I am flying high");
    }

    public Jet(String vehicleType) {
        super(vehicleType);
    }
}
