package com.oop;

public enum Size {

    VERY_SMALL("XS"), SMALL("S"), AVARAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFINED("");

    Size(String abbreviation){ this.abbreviation = abbreviation;}

    private String abbreviation;

    public String getabbreviation;

    public String getAbbreviation (){ return abbreviation;}
}

