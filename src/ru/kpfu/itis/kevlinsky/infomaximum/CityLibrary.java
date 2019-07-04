package ru.kpfu.itis.kevlinsky.infomaximum;

import java.util.*;

public class CityLibrary {
    private List<City> cities = new ArrayList<>();
    private static CityLibrary instance;

    public static CityLibrary getInstance(){
        if (instance == null){
            instance = new CityLibrary();
        }
        return instance;
    }

    private CityLibrary(){}

    public void addCity(String name, int floor){
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getName().equals(name)){
                switch (floor){
                    case 1: cities.get(i).addOneFloor();
                    case 2: cities.get(i).addTwoFloor();
                    case 3: cities.get(i).addThreeFloor();
                    case 4: cities.get(i).addFourFloor();
                    case 5: cities.get(i).addFiveFloor();
                }
                return;
            }
        }
        City city = new City();
        city.setName(name);
        switch (floor){
            case 1: city.addOneFloor();
            case 2: city.addTwoFloor();
            case 3: city.addThreeFloor();
            case 4: city.addFourFloor();
            case 5: city.addFiveFloor();
        }
        this.cities.add(city);
    }

    public void writeFloorCount(){
        Collections.sort(this.cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).toString());
        }
    }

    public int size(){
        return this.cities.size();
    }
}
