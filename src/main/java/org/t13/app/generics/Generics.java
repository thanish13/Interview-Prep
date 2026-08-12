package org.t13.app.generics;

public class Generics {

    static void main() {
        System.out.println(method("Hello", 1));
        System.out.println(method("2", "World"));

    }

    public static <T, R> R method(T type, R result){
        return result;
    }
}
