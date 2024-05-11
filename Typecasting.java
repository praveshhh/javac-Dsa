import java.util.Scanner;

public class Typecasting {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        //float num = input.nextFloat();

        int num = (int) (67.56f);
        //System.out.println(num);

        byte a= 100;
        byte b=20;
        byte c= 5;
        int d= a * b/c;
        System.out.println(d);

    }
}