import java.util.Scanner;

public class CordisTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.println(getcount(max) - getcount(min-1));
    }

    private static int getcount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10)
            count += (n - i + 1);
        return count;
    }
}
