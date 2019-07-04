package ru.kpfu.itis.kevlinsky.infomaximum.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.kpfu.itis.kevlinsky.infomaximum.AddressLibrary;
import ru.kpfu.itis.kevlinsky.infomaximum.CityLibrary;
import ru.kpfu.itis.kevlinsky.infomaximum.XMLAddressReader;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

public class TestXMLAddressReader {
    private XMLAddressReader reader;

    @Before
    public void createReader(){
        this.reader = new XMLAddressReader();
    }

    @Test
    public void shouldHaveAddressesInLibrary(){
        try {
            this.reader.read(new File("address.xml"));
            AddressLibrary addressLibrary = AddressLibrary.getInstance();
            Assert.assertTrue(addressLibrary.size() > 0);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldHaveCitiesInLibrary(){
        try {
            this.reader.read(new File("address.xml"));
            CityLibrary cityLibrary = CityLibrary.getInstance();
            Assert.assertTrue(cityLibrary.size() > 0);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
