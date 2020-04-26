import java.util.*;
import java.lang.*;
public class Person
{
    private final String name;
    private String address;

    public Person(final String name, final String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address)
    {
        this.address=address;
    }
    @Override
    public String toString()
    {
        return name + " ("+address+")";
    }



}
