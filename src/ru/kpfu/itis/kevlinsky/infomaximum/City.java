package ru.kpfu.itis.kevlinsky.infomaximum;

public class City {
    private String name;
    private int oneFloorCount;
    private int twoFloorCount;
    private int threeFloorCount;
    private int fourFloorCount;
    private int fiveFloorCount;

    public City(){
        this.oneFloorCount = 0;
        this.twoFloorCount = 0;
        this.threeFloorCount = 0;
        this.fourFloorCount = 0;
        this.fiveFloorCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOneFloorCount() {
        return oneFloorCount;
    }

    public int getTwoFloorCount() {
        return twoFloorCount;
    }

    public int getThreeFloorCount() {
        return threeFloorCount;
    }

    public int getFourFloorCount() {
        return fourFloorCount;
    }

    public int getFiveFloorCount() {
        return fiveFloorCount;
    }

    public void addOneFloor(){
        this.oneFloorCount++;
    }

    public void addTwoFloor(){
        this.twoFloorCount++;
    }

    public void addThreeFloor(){
        this.threeFloorCount++;
    }

    public void addFourFloor(){
        this.fourFloorCount++;
    }

    public void addFiveFloor(){
        this.fiveFloorCount++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (oneFloorCount != city.oneFloorCount) return false;
        if (twoFloorCount != city.twoFloorCount) return false;
        if (threeFloorCount != city.threeFloorCount) return false;
        if (fourFloorCount != city.fourFloorCount) return false;
        if (fiveFloorCount != city.fiveFloorCount) return false;
        return name != null ? name.equals(city.name) : city.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + oneFloorCount;
        result = 31 * result + twoFloorCount;
        result = 31 * result + threeFloorCount;
        result = 31 * result + fourFloorCount;
        result = 31 * result + fiveFloorCount;
        return result;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | OneFloorCount: " + oneFloorCount + " | TwoFloorCount: " + twoFloorCount + " | ThreeFloorCount: " + threeFloorCount + " | FourFloorCount: " + fourFloorCount + " | FiveFloorCount: " + fiveFloorCount;
    }
}
