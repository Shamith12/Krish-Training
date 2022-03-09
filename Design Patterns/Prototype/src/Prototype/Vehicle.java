package Prototype;

public abstract class Vehicle implements Cloneable {
    private String fuelType;
    private int engineCapaity;


    public int getEngineCapaity() {
        return engineCapaity;
    }

    public void setEngineCapaity(int engineCapaity) {
        this.engineCapaity = engineCapaity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {//do is just go to super clone method
        return super.clone();
    }
}
