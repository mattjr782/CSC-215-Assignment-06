/******************************
 *
 * File: Equals_And_DownCasting_MatthewRivera
 * By: Matthew Rivera
 * Date: 04/24/2026
 * Description: This is the driver class for part C of assignment 06
 *
 ******************************/

package Part_C;

import org.w3c.dom.ls.LSOutput;

public class Equals_And_CompareTo_MatthewRivera {
    public static void main(String[] args){
        String s1 = "yes";
        String s2 = s1;
        String s3 = "no";
        String s4 = "yes";
        char c = 'y';

        System.out.println(s1 == s2);// true
        System.out.println(s1 == s3);//false
        //System.out.println(s1 == c); ERROR

        Oven o1 = new Oven(300);
        Oven o2 = new Oven(300);
        Oven o3 = new Oven(350);

        System.out.println(o1.equals(o2));//true
        System.out.println(o1.equals(o3));//false
        System.out.println(o1.equals("Hello World!"));//false

        System.out.println(o1.compareTo(o2));//0
        System.out.println(o1.compareTo(o3));//-50
        System.out.println(o3.compareTo(o1));//50
        //System.out.println(o2.compareTo("Hello World!")); ERROR
    }
}
