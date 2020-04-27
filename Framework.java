import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Framework {
    //collection can be used so, that anything can be used in it that has a list in it(ArrayList, List, LinkedList 28th row)
    //ArrayList<String> stuff;
    //List<String> stuff;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("Pepega2.txt"));

        ArrayList<String> Pepega2 = new ArrayList<String>();

        while(in.hasNextLine()) {
            Pepega2.add(in.nextLine());

        }

        for (int i = 0; i < Pepega2.size(); i++) {
            System.out.println("Word: " + Pepega2.get(i));
        }
        in.close();

        //Framework p = new Framework();
        //p.stuff = new ArrayList<String>();
        //p.stuff = new LinkedList<String>();
        // !IMPORTANTO (FILO And FIFO (First in last out, First in first out))!IMPORATNTO
    }
}
