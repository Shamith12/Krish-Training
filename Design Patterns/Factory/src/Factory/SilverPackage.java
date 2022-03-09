package Factory;

public class SilverPackage extends Package {
    protected void CreatePackage(){
        decorations.add(new BridalDeco());
        decorations.add(new BridesMaidDeco());
    }
}
