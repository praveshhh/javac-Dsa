import java.util.Scanner;
public class Loops{
    public static void main(String [] args){
       
       // for (int num=-1 ; num<=10; num++){
//            System.out.println(num);

      //  }
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for ( int num=1; num<=n; num++){
        System.out.print( num + "  " );
      } 
    }
}