import java.util.Scanner;

class AvgToGive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rf = isArmStrong(i);
            if (rf)
                System.out.println(i + " ");
        }
    }

    static boolean i(int x) {
        double sum = 0;
        int y = x;
        int dc = power(x);
        do {
            int d = x % 10;
            sum = sum + Math.pow(d, dc);
            x = x / 10;
        } while (x != 0);
        if (sum == y)
            return true;
        else
            return false;
    }

    static int power(int z) {
        int count = 0;
        do {
            int f = z % 10;
            count++;
            z = z / 10;
        } while (z != 0);
        return count;
    }
}
