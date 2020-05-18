package org.launchcode.enumerableplanets.data;

public enum Planets {
    // list the planets here.
    // Mercury, Venus, Earth, Mars, Jupiter,
    // Saturn, Uranus, Neptune
    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH ("Earth", 365),
    MARS ("Mars", 687),
    JUPITER ("Jupiter", 4333),
    SATURN ("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE ("Neptune", 60200);


    private final String name;
    private final int yearLength; // number of Earth days on each planet

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
