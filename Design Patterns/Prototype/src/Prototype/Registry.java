package Prototype;
import java.util.*;
import java.util.HashMap;

//Registry means  is the place where you create the object what you initially created
public class Registry {
    private  Map<VehicleType, Vehicle>vehicles =  new HashMap<>();

    public Registry() {
       this.initialize();
    }

    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        try {
             vehicle =(Vehicle) vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehicle;
    }

    private void initialize() {
        Car car = new Car();
        car.setEngineCapaity(2000);
        car.setType("MINI");
        car.setFuelType("Gasoline");

        Bus bus = new Bus();
        bus.setEngineCapaity(3000);
        bus.setNumberOfSeats(32);
        bus.setFuelType("Diseal");

        vehicles.put(VehicleType.CAR,car);
        vehicles.put(VehicleType.BUS,car);
    }
}
