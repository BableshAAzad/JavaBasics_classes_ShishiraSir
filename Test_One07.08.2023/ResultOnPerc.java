import java.util.Scanner;

class ResultOnPerc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        if (n >= 75 && n<=100)
            System.err.println(n + " pass with distinct");
        else if (n >= 65 && n < 75)
            System.out.println(n + " pass with first");
        else if (n >= 55 && n < 65)
            System.out.println(n + " pass with second");
        else if (n >= 45 && n < 55)
            System.out.println(n + " pass");
        else
            System.out.println(n + " is fail");
    }
}
