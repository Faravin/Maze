import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterators {

    public static void main(String [] args){
        LinkedList<String> names = new LinkedList<String>();
        names.push("Elisa");
        names.push("Sarah");
        names.push("Harry");

        ListIterator<String> it = names.listIterator(); //it is it's name can use whatever to name it
        it.next();
        it.next();
        it.add("Susan");


        for (String s : names) {
            System.out.println(s);
        }




    }
}
