package org.t13.app.memoryState;

public class Execution {


    static void main() {
        EntryPoint entryPoint = new EntryPoint();

        DataSource dataSource = entryPoint.getDataSource();

        dataSource.add("Object1");
        dataSource.add("Object2");

        dataSource.printData();

        DataSource dataSource2 = entryPoint.getDataSource();

        dataSource2.printData();

        dataSource.add("Object3");

        dataSource.printData();

        dataSource2.printData();


    }
}
