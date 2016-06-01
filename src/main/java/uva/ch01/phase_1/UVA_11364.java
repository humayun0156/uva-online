package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_11364 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int max = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > max) {
                    max = x;
                }
                if (min > x) {
                    min = x;
                }
            }
            System.out.println((max-min)*2);
        }
    }
}
