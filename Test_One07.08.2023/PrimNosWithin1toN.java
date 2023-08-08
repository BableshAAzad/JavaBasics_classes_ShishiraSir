import java.util.Scanner;

class PrimNosWithin1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rs = isPrime(i);
            if (rs)
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int i) {
        for (int x = 2; x <= i / 2; x++) {
            if (i % x == 0) {
                return false;
            }
        }
        return true;
    }
}
