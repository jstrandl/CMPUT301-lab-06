package com.example.listycity;

/**
 * This is a class that defines a city.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor to create a new city by its name and province
     * @param city
     *     the name of the new city
     * @param province
     *     the province of the new city
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city's name
     * @return The city's name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Returns the city's province
     * @return The city's province
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     *
     * @param o
     *     City to compare this City to
     * @return The result is a negative integer if this city's name lexicographically precedes the argument string. The result is a positive integer if this city's name lexicographically follows the argument string. The result is zero if the names are equal.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }
}
