package Concretes;

import Interface.IDE;

/**
 *
 * @author Mert Acikportali
 */

//Methods of NetBeans
public class NetBeans implements IDE {
    
    @Override
    public void code() {
       System.out.println("NetBeans: code()");
    }

    @Override
    public void compile() {
       System.out.println("NetBeans: compile()");
    }

    @Override
    public void execute() {
        System.out.println("NetBeans: execute()\nDone!\n");
    }
}