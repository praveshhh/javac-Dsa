import java.util.Scanner;
public class IncrementDecrement{
public static void main(String[] args){


      Scanner input = new Scanner (System.in);

 System.out.println("enter the input x: " );
    int x = input.nextInt();


    int y;

    
    y=++x;

    
    System.out.println("x = "+ x + " and y = "+y);
}
}