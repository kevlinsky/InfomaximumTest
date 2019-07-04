package ru.kpfu.itis.kevlinsky.infomaximum;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class XMLAddressReader {
    private AddressLibrary addresses = AddressLibrary.getInstance();
    private CityLibrary cities = CityLibrary.getInstance();

    public void read(File file) throws IOException, XMLStreamException {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(file));
        while (eventReader.hasNext()){
            XMLEvent event = eventReader.nextEvent();
            if (event.isStartElement()){
                StartElement startElement = event.asStartElement();
                if (startElement.getName().toString().equals("item")){
                    Address address = new Address();
                    Iterator<Attribute> it = startElement.getAttributes();
                    String name = "";
                    int floor = 0;
                    while (it.hasNext()){
                        Attribute attribute = it.next();
                        if (attribute.getName().toString().equals("city")){
                            address.setCity(attribute.getValue());
                            name = attribute.getValue();
                        }
                        if (attribute.getName().toString().equals("street")){
                            address.setStreet(attribute.getValue());
                        }
                        if (attribute.getName().toString().equals("house")){
                            address.setHouse(Integer.parseInt(attribute.getValue()));
                        }
                        if (attribute.getName().toString().equals("floor")){
                            address.setFloor(Integer.parseInt(attribute.getValue()));
                            floor = Integer.parseInt(attribute.getValue());
                        }
                    }
                    this.addresses.addAddress(address);
                    this.cities.addCity(name, floor);
                }
            }
        }
    }
}
