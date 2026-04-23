/******************************
 *
 * File: Flower.java
 * By: Matthew Rivera
 * Date: 04/22/2026
 * Description: This is a class to represent a Flower. it extends Plant.java
 *
 ******************************/

package Part_A;

public class Flower extends Plant {
    //Attributes
    private static String color, type;

    //Constructors
    public Flower() {
        super();
    }

    public Flower(String color, String type, int age, int height) {
        this.color = color;
        this.type = type;
        super(age, height);
    }

    //Methods
    public static void printFlower() {
        System.out.printf("Flower Color:%15s%10sFlower Type: %15s\n", color, "", type);
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
