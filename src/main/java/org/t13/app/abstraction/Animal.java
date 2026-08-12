package org.t13.app.abstraction;

public abstract class Animal {

    String name;

    public Animal(String name){
        this.name = name;
    }

    public void name() {
        System.out.println("Animal name is : " + name);
    }

    public abstract void makeSound();
}
