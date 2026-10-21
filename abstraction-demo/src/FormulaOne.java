public class FormulaOne extends Vehicle{
    @Override
    public void go() {
        System.out.println("I am flying fast.");
    }

    public FormulaOne(String vehicleType){
        super(vehicleType);
    }
}
