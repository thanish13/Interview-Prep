package org.t13.app.memoryState;

import java.util.HashMap;

public class DataSource {

    private HashMap<String, String> objMap = new HashMap<>();
    private int count = 1;

    public void add(String name){
        objMap.put("Key" + count++, name);
    }

    public void printData(){
        System.out.println("Keys : " + objMap.keySet());
        System.out.println("Values : " + objMap.values());

    }
}
