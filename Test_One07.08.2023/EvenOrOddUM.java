import java.util.Scanner;

class EvenOrOddUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.err.println(n + " is a even number");
        else
            System.out.println(n + " is not a even number");
    }
}