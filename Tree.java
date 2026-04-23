/******************************
 *
 * File: Tree.java
 * By: Matthew Rivera
 * Date: 04/22/2026
 * Description: This is a class to represent a tree. it extends Plant.java
 *
 ******************************/

package Part_A;

public class Tree extends Plant {
    //Attribute
    private static String type;

    //constructors
    public Tree() {
        super();
    }

    public Tree(String type, int age, int height) {
        this.type = type;
        super(age, height);
    }

    //methods
    public static void printTree() {
        System.out.printf("Tree Type:%4s%-15s\n", "", type);
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
