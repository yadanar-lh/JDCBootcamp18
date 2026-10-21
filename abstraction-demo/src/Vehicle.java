//abstract      sealed          final

public abstract class Vehicle {
    private String vehicleType;

    //abstract method
    //the first concrete subclass must override abstract methods form his parent

    //Abstract class is used when parent's/abstract class's methods must be overridden.
    //abstract cannot be private or final.


    //public , protected, default, cannot be private

    public abstract void go();

    public Vehicle(String vehicleType){
        this.vehicleType = vehicleType;
    }


}
