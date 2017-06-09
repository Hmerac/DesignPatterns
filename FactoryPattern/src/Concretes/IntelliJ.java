package Concretes;

import Interface.IDE;

/**
 *
 * @author Mert Acikportali
 */

//Methods of IntelliJ
public class IntelliJ implements IDE {
    
    @Override
    public void code() {
       System.out.println("IntelliJ: code()");
    }

    @Override
    public void compile() {
       System.out.println("IntelliJ: compile()");
    }

    @Override
    public void execute() {
        System.out.println("IntelliJ: execute()\nDone!\n");
    }
}