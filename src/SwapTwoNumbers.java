public class SwapTwoNumbers {

    public static void main(String[] args) {

        int m=20,n=30;

        System.out.println("Befor swapping M=" +m +" n="+n );

        /*int temp= m;
        m=n;
        n=temp;*/

        m= m+n;
        n=m-n;
        m=m-n;

       System.out.println("After swapping M=" +m +"n+"+n );
    }
}
