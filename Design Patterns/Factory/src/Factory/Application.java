package Factory;

public class Application {
    public static void main(String[] args) {
        Package aPackage = PackageFactory.createPackage(PackageCode.BASIC);
        System.out.println(aPackage);

        Package aPackage1 = PackageFactory.createPackage(PackageCode.SILVER);
        System.out.println(aPackage1);
    }
}
