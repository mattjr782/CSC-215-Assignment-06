/******************************
 *
 * File: Plant.java
 * By: Matthew Rivera
 * Date: 04/22/2026
 * Description: This is a class to represent a plant
 *
 ******************************/

package Part_A;

public class Plant {
    //Attributes
    private int age, height;

    //constructors
    public Plant() {
    }

    public Plant(int age, int height) {
        this.age = age;
        this.height = height;
    }

    //method(s)
    public void printPlant() {
        System.out.printf("Plant Age:%4d%10sPlant Height:%4d\n", age, "", height);
    }


    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
