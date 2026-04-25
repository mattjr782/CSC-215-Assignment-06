/******************************
 *
 * File: UpCasting_And_DownCasting_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 04/24/2026
 * Description: This is the driver class for part B of assignment 06
 *
 ******************************/
package Part_B;

import Part_A.Plant;
import Part_A.Tree;

public class UpCasting_And_DownCasting_MatthewRivera {
    public static void main(String[] args) {
        Plant plantOne = new Plant(17, 30);
        Tree treeOne = new Tree("oak", 13, 50);
        // Tree treeTwo = (Tree) plantOne; ERROR, failed down casting
        Plant plantTwo = treeOne;// proper upcasting
        Tree treeThree = (Tree) plantTwo;// proper down casting

        treeThree.printTree();  //Tree Type:    oak
        //plantOne.printTree(); ERROR printTree method not in Plant class
        plantOne.printPlant();  // Plant Age   17         Plant Height: 30
        treeThree.printPlant();  // Plant Age   13         Plant Height: 50
        treeThree.printTree();  // Tree Type:    oak
    }
}
