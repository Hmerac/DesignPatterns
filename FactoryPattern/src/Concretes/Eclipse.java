package Concretes;

import Interface.IDE;

/**
 *
 * @author Mert Acikportali
 */

//Methods of Eclipse
public class Eclipse implements IDE {
    
    @Override
    public void code() {
       System.out.println("Eclipse: code()");
    }

    @Override
    public void compile() {
       System.out.println("Eclipse: compile()");
    }

    @Override
    public void execute() {
        System.out.println("Eclipse: execute()\nDone!\n");
    }
}