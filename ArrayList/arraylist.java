package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * arraylist
 */
public class arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>();
        // //for adding element in list, you have to use .add(element)
        // list.add(25);
        // list.add(45);
        // list.add(87);
        // //for remove element in list, you have to use .remove(index or element)
        // list.remove(0);

        // System.out.println(list);

        //multidimensional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

        //initoalozation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //input
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}