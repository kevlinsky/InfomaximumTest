package ru.kpfu.itis.kevlinsky.infomaximum.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.kpfu.itis.kevlinsky.infomaximum.Address;
import ru.kpfu.itis.kevlinsky.infomaximum.AddressLibrary;

public class TestAddressLibrary {
    private AddressLibrary addressLibrary;

    @Before
    public void createLibrary(){
        this.addressLibrary = AddressLibrary.getInstance();
    }

    @Test
    public void shouldAddAddress(){
        Address address = new Address();
        this.addressLibrary.addAddress(address);
        Assert.assertTrue(this.addressLibrary.size() > 0);
    }

    @Test
    public void shouldReturnSize(){
        Address address = new Address();
        this.addressLibrary.addAddress(address);
        Assert.assertEquals(1, this.addressLibrary.size());
    }

}
