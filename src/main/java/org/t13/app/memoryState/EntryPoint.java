package org.t13.app.memoryState;

import java.util.HashMap;
import java.util.function.Supplier;

public class EntryPoint {

//    HashMap<String, DataSource> dataSourceHashMap = new HashMap<>();
//
//    public EntryPoint(){
//        dataSourceHashMap.put("DataSource1", new DataSource());
//    }
//
//    public DataSource getDataSource(){
//        return dataSourceHashMap.get("DataSource1");
//    }

    HashMap<String, Supplier<DataSource>> dataSourceHashMap = new HashMap<>();

    public EntryPoint(){
        dataSourceHashMap.put("DataSource1", () -> new DataSource());
    }

    public DataSource getDataSource(){
        return dataSourceHashMap.get("DataSource1").get();
    }

}
