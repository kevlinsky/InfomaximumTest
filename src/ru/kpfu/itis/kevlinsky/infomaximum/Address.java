package ru.kpfu.itis.kevlinsky.infomaximum;

public class Address implements Comparable<Address> {
    private String city;
    private String street;
    private int house;
    private int floor;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (house != address.house) return false;
        if (floor != address.floor) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + house;
        result = 31 * result + floor;
        return result;
    }

    @Override
    public String toString() {
        return "City: " + this.city + " | Street: " + this.street + " | House: " + this.house + " | Floor: " + this.floor;
    }

    @Override
    public int compareTo(Address o) {
        if (this.city.equals(o.getCity()) && this.street.equals(o.getStreet()) && this.house == o.getHouse() && this.floor == o.getFloor()){
            return 0;
        } else {
            if (this.house > o.getHouse()){
                return 1;
            } else {
                return -1;
            }
        }
    }
}
