package singleton;

import javax.xml.crypto.Data;

public class Driver {

    public static void main(String[] args) {
//        LazySingleton l1 =  LazySingleton.getInstance();
//        LazySingleton l2 =  LazySingleton.getInstance();
//
//        System.out.println(l1.hashCode());
//        l1.printData();
//
//        System.out.println(l2.hashCode());
//        l2.printData();

        new DataPrinter().start();

        new DataPrinter().start();
    }
}

class DataPrinter extends Thread {
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}
