/******************************
 *
 * File: SupperClass_And_Subclass_Access_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 04/22/2026
 * Description: This is the driver class for part A of assignment 06
 *
 ******************************/

package Part_A;

public class SuperClass_And_Subclass_Access_MatthewRivera {
    public static void main(String[] args) {
        Plant treePlant = new Tree("oak", 16, 100);
        //Tree tree = new Plant(12, 50); ERROR
        Tree tree = new Tree("Pine", 12, 150);

        treePlant.printPlant();
        //treePlant.printTree(); Error

        Tree.printTree();
        //Tree.printFlower(); Error
    }
}
