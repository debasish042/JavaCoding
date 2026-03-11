import java.util.Scanner;

class Geeks {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter a sentence");

        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);

        System.out.println("enter a number");

        int a = s.nextInt();
        System.out.println("You entered integer " + a);
        s.close();
    }
}