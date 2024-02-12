
import java.lang.*;
import java.util.*;
import java.io.*;

public class Way_too_long {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] x = new int[10];
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        char firstLetter, lastLetter;
        int between;
        int strLen = 0;
        for (int i = 0; i < n; i++) {
            strLen = words[i].length();
            if (strLen <= 10) {
                System.out.println(words[i]);
            } else {
                firstLetter = words[i].charAt(0);
                lastLetter = words[i].charAt(strLen - 1);
                between = strLen - 2;
                System.out.println(firstLetter + ("" + between) + lastLetter);
            }
        }
    }
} 
