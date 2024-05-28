import java.util.Scanner;
public class SwitchCaseBreak{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        String fruit = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("yello colour delicious fruit also known as king of fruits ");
                break;
                case "Orange":
                    System.out.println("Vitamon C fruit ");
                    break;
                    case "apple":
                        System.out.println("Vitamin A fruit");
                        break;
                        default:
                            System.out.println("Enter a valid fruit");
        }
    }
}