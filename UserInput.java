//user input
import java.util.Scanner ;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");

        int num = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int sum  = num+ num2;
        System.out.println("The sum of the numbers is "+ sum);

        if (sum == 30){
            System.out.println("30");
        } else if (sum == 40) {

            System.out.println("40");
        }
        else{
            System.out.println("other than 30 and 40");
        }
    }
}
