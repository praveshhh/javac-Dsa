import java.util.ArrayList;
public class ArrayListExample{
    public static void main (String args []){

        //Syntax
        ArrayList <Integer> list = new ArrayList<> ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.contains(3));
        System.out.println(list);
    }
}