package modelo.prototype;
import java.util.*;



public class AptoPrototype {

    public AptoPrototype() {
    }
    private static Map<String, IAptoPrototype> prototypes = new  HashMap<String, IAptoPrototype>();

    public static IAptoPrototype getPrototype(String prototypeName) {
    	return prototypes.get(prototypeName).deepClone();
    }
    public static void addPrototype(String prototypeName, IAptoPrototype prototype) {
    	prototypes.put(prototypeName, prototype);
    }

}