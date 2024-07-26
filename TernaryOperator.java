import java.util.Scanner;
public class TernaryOperator{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("entr the number for the first 'time:");
        int num1 =scanner.nextInt();
          System.out.println("entr the number for the second time:");
              int num2 =scanner.nextInt();

              int min;
              int max;
              min=(num1<num2)? num1: num2;
              max=(num1<num2)?num2: num1;
              System.out.println("The minimum of two numbers:"   +num1+  "and"  +num2+  "is:"  +min);
               System.out.println("The maximum of two numbers:"   +num1+  "and"  +num2+  "is:"  +max);
    }
}