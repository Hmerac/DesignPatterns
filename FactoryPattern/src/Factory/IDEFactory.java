package Factory;

import Concretes.*;
import Interface.IDE;

/**
 *
 * @author Mert Acikportali
 */

//Factory Concept
public class IDEFactory {

    public IDE getIDE(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("NetBeans")) {
            return new NetBeans();
        } else if (shapeType.equalsIgnoreCase("Eclipse")) {
            return new Eclipse();
        } else if (shapeType.equalsIgnoreCase("IntelliJ")) {
            return new IntelliJ();
        }

        return null;
    }
}
