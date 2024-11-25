package com.example.ex11063_customspinner;

public class country
{
    int flag;
    String countryName;
    String capital;
    int population;

    public country(int flag, String countryName, String capital, int population)
    {
        this.flag = flag;
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public int getFlag()
    {
        return flag;
    }

    public int getPopulation()
    {
        return population;
    }

    public String getCapital()
    {
        return capital;
    }
}
