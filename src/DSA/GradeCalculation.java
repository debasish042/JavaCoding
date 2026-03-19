package DSA;

import java.util.Scanner;

class GradeCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your marks: ");

        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else if (marks >= 35) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}