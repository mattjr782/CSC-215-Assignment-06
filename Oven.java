/******************************
 *
 * File: Oven.java
 * By: Matthew Rivera
 * Date: 04/24/2026
 * Description: This is the Oven class for part C of Assignment 06
 *
 ******************************/

package Part_C;

public class Oven {
    //Attribute
    private int temperature;

    //constructors
    public Oven() {
    }

    public Oven(int temperature) {
        this.temperature = temperature;
    }


    //methods

    @Override
    public boolean equals(Object o) {
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }
        return this.temperature == ((Oven) o).getTemperature();
    }

    public int compareTo(Oven o) {
        if (this.temperature == o.temperature) {
            return 0;
        } else return temperature - o.getTemperature();
    }

    public int getTemperature() {
        return temperature;
    }
}
