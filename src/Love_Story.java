
import java.util.Scanner;
public class Love_Story {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int count = difference(s);
            System.out.println(count);
        }
    }
    private static int difference(String s) {
        String origin = "codeforces";
        int count = 0;
        for (int i = 0; i < origin.length(); i++) {
            if (s.charAt(i) != origin.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

