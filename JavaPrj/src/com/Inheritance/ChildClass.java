package com.Inheritance;

public class ChildClass extends Parentclass{

    public static void main(String args[]){
        ChildClass cc = new ChildClass();
        cc.City();
        cc.State();
        cc.childState();

        Parentclass c1 = new ChildClass();
        c1.City();
        Parentclass c2 = new Parentclass();
        c2.City();

    }

    public void childState(){
        System.out.println("UP");
    }

    public void State(){
        System.out.println("UP Child");
    }

}
