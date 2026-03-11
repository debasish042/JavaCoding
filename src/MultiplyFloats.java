import java.util.Scanner;

public class MultiplyFloats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first float number");

        float f1=sc.nextFloat();

        System.out.println("Enter the second float number");

        float f2=sc.nextFloat();

        float f3=f1*f2;

        System.out.println("The multiplication is: " + f3);
    }
}
