package ru.kpfu.itis.kevlinsky.infomaximum.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.kpfu.itis.kevlinsky.infomaximum.CityLibrary;

public class TestCityLibrary {
    private CityLibrary cityLibrary;

    @Before
    public void creatLibrary(){
        this.cityLibrary = CityLibrary.getInstance();
    }

    @Test
    public void shouldAddCity(){
        this.cityLibrary.addCity("Саранск", 2);
        Assert.assertTrue(this.cityLibrary.size() > 0);
    }

    @Test
    public void shouldReturnSize(){
        this.cityLibrary.addCity("Саранск", 2);
        Assert.assertEquals(1, this.cityLibrary.size());
    }
}
