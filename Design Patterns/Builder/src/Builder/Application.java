package Builder;

public class Application {
    public static void main(String[] args) {
        Car.Builder builder = new Car.Builder("Full");
        Car car = builder.dropOfLocation("LAS").roadAssistance("Full").build();
        System.out.println(car);
    }
}
