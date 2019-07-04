package ru.kpfu.itis.kevlinsky.infomaximum;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        XMLAddressReader reader = new XMLAddressReader();
        try {
            reader.read(new File("address.xml"));
            AddressLibrary addressLibrary = AddressLibrary.getInstance();
            CityLibrary cityLibrary = CityLibrary.getInstance();
            addressLibrary.writeDuplicates();
            System.out.println("-------------------------------------------------------------");
            cityLibrary.writeFloorCount();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения программы: " + (end - start)/1000 + " секунд");
    }
}
