package oop.parcial2.neighborhood;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class StreetBuilder
{
    private String name;
    private TreeMap<Integer, House> houses;

    public StreetBuilder name(String name)
    {
        this.name = name;

        return this;
    }

    public StreetBuilder houses(TreeMap<Integer, House> houses)
    {
        this.houses = houses;

        return this;
    }

    public StreetBuilder house(int number, House house)
    {
        houses.put(number, house);

        return this;
    }

    public Street build()
    {
        return new Street(name,houses);
    }
}
