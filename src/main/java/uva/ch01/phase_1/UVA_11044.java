package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_11044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((n/3) * (m/3));
        }
    }
}
