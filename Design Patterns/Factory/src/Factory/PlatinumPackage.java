package Factory;

public class PlatinumPackage extends Package{
    protected void CreatePackage(){
        decorations.add(new BridalDeco());
        decorations.add(new BridesMaidDeco());
        decorations.add(new FlowerGirlDeco());
        decorations.add(new ParentDeco());
    }
}
