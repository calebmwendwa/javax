import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayruby {
    public static void main(String[] args) throws IOException {
        //5 elements
        int y = 5;
        ArrayList<Integer> caleb = new ArrayList<>(y);
        for (int i = 1; i <= y; i++)
            caleb.add(i);

        System.out.println(caleb);
        caleb.remove(3);
        System.out.println(caleb);
        for (int i = 0; i < caleb.size(); i++)
            System.out.println(caleb.get(i) + " ");
        // TODO: 3/23/18  run in a dialog;
    }
}