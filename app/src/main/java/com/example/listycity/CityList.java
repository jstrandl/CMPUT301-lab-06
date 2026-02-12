package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of City objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *     Candidate city to add
     * @throws IllegalArgumentException
     *     If the list already contains the city
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return sorted list of tracked cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if the given city belongs in the list
     * @param city
     *     The City to check if it belongs in the list
     * @return True if the city belongs in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes the provided city if it exists in the list. Otherwise throws an exception
     * @param city
     *     Candidate City to delete
     * @throws IllegalArgumentException
     *     If the list doesn't contain the City
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list
     * @return Number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
