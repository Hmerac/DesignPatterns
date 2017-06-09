package ProductIDE;

import Factory.IDEFactory;
import Interface.IDE;

/**
 *
 * @author Mert Acikportali
 */

//Production phase of an IDE
public class ProductIDE {

    public static void main(String[] args) {
        //Build the factory
        IDEFactory ideFactory = new IDEFactory();

        //Create a NetBeans IDE
        IDE netbeans = ideFactory.getIDE("Netbeans");

        //Code - Compile - Execute
        netbeans.code();
        netbeans.compile();
        netbeans.execute();

        //Create an Eclipse IDE
        IDE eclipse = ideFactory.getIDE("Eclipse");

        //Code - Compile - Execute
        eclipse.code();
        eclipse.compile();
        eclipse.execute();

        //Create an IntelliJ IDE
        IDE intellij = ideFactory.getIDE("IntelliJ");

        //Code - Compile - Execute
        intellij.code();
        intellij.compile();
        intellij.execute();
    }
}
