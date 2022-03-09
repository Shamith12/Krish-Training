package Builder;

public class Car {
    private final String insurance;
    private  final Boolean etc;
    private final String roadAssistance;
    private final String dropOfLocation;

    public Car(Builder builder) {
        this.insurance = builder.insurance;
        this.etc = builder.etc;
        this.dropOfLocation = builder.dropOfLocation;
        this.roadAssistance = builder.roadAssistance;
    }

    static  class Builder{
        private String insurance;
        private Boolean etc;
        private String roadAssistance;
        private String dropOfLocation;

        public Car build(){
            return new Car(this);
        }

        //There may be situation when you create object these parameter must be there.
        // If that case you can enforce that with a constructor.

        public Builder(String insurance) {
            this.insurance = insurance;
        }

        //We create four different methods each method will set the
        // particular parameter and return the same object

        public Builder etc(Boolean etc){
            this.etc = etc;
            return  this;
        }

        public Builder roadAssistance(String roadAssistance){
            this.roadAssistance = roadAssistance;
            return  this;
        }

        public Builder dropOfLocation(String dropOfLocation){
            this.dropOfLocation = dropOfLocation;
            return  this;
        }
    }

    @Override
    public String toString() {
        return "Builder{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOfLocation='" + dropOfLocation + '\'' +
                '}';
    }

}
