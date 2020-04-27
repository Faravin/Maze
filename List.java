import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class List {


        public static void main(String [] args) {
            //try {
                //Scanner in = new Scanner(new File ("File")); (seeing where it starts, where the error comes from line 11)
            //} catch (FileNotFoundException e) {
             //   e.printStackTrace();
           // }


        LinkedList<String> names = new LinkedList<String>();
        //names.add("Peepo");
        //names.add("Peepa");
        //names.add("Peepe");

        names.push("Peepo");//this is a stack FILO(First in last out)
        names.push("Peepa");
        names.push("Peepe");

        System.out.println(names.remove()); //can use pop same as removeFirst, but remove you can add an arggument which one to remove.
        System.out.println(names.remove()); //can use removeFirst same as pop
        System.out.println(names.remove());

        //names.remove(one that takes nothing, one that takes an object, one that takes an index) line 16

    }
}
