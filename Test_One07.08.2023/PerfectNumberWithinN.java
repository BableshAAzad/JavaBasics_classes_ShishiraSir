import java.util.Scanner;

class PerfectNumberWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rf = isPerfect(i);
            if (rf)
                System.out.println(i + " ");
        }
    }

    static boolean isPerfect(int x) {
        int sum = 0, y = x;
        for (int i = 1; i <= x/2; i++) {
            if (x%i == 0) {
                sum=sum+i;
            }
        }
        if (sum == y)
            return true;
        else
            return false;
    }
}
