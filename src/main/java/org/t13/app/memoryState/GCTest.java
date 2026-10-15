package org.t13.app.memoryState;

import lombok.Setter;

import java.util.HashMap;

public class GCTest {

    record User(String name) {
    }



    static void main() {
        HashMap<String, User> map = new HashMap<>();
        User ID1 = new User("Person 1");
        map.put("ID1", ID1);
        ID1 = new User("Person 1 - New");
        //map.put("ID1", new User("Person 1 - New"));
        System.out.println(ID1.name());
        System.out.println(map.get("ID1").name());
    }
}
