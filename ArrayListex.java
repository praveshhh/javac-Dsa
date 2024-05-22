import java.util.ArrayList;
public class ArrayListex{
    public static void main (String[] args){
        ArrayList <Integer> list= new ArrayList <> ();
        list.add(10);
        list.add(12);
        list.add(16);
        System.out.println(list);
        list.set(1, 15);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}