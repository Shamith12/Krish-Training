package Factory;
import java.util.*;

public abstract class Package {

    protected List<Decoration> decorations= new ArrayList<>();

    public Package(){
        CreatePackage();
    }

    protected abstract void CreatePackage();//we always give this to implement on implemented classes.
    //now in a system we just give the package. they can crete any number of packages putting this a different sort of decorations
    //So for that we use a package Factory

    public String toString(){
        return "Package{"+"decorations="+decorations+'}';
    }
}
