import java.util.Scanner;
public class CaseCheck{
    public static void main (String args[]){
    //     Scanner in = new Scanner(System.in);
    //    // char ch = in.nextInt().trim().charAt(0);
    //     String word = "hello ";
    //     System.out.println(word.charAt(0));
    //    // System.out.println(ch);
Scanner in = new Scanner(System.in);
char ch = in.next().trim().charAt(0);

if (ch > 'a' && ch <= 'z' ) {
    System.out.println("lower case");

}
else{
    System.out.println("uppercase");
}





    }
} 