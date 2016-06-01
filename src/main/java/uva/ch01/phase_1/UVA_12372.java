package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_12372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while (t-- > 0) {
            int l = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (l <= 20 && w <= 20 && h <= 20) {
                System.out.printf("Case %d: good%n", i++);
            } else {
                System.out.printf("Case %d: bad%n", i++);
            }
        }
    }
}
