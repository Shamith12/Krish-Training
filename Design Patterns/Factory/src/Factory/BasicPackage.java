package Factory;

public class BasicPackage extends Package {
    protected void CreatePackage(){
        decorations.add(new BridalDeco());
    }
}
