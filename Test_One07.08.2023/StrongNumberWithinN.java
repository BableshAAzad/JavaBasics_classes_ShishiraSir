import java.util.Scanner;

class StrongNumberWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rf = isStrong(i);
            if (rf)
                System.out.println(i + " ");
        }
    }

    static boolean isStrong(int x) {
        int sum = 0, y = x;
        do {
            int d = x % 10;
            sum = sum + facto(d);
            x = x / 10;
        } while (x != 0);
        if (sum == y)
            return true;
        else
            return false;
    }

    static int facto(int z) {
        int f = 1;
        while (z > 1) {
            f = f * z;
            z--;
        }
        return f;
    }

}
