package uva.ch01.phase_2;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_11332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {

            while ((n =fn(n)) > 9) {
            }
            System.out.println(n);
        }

    }

    public static int fn(int i) {
        if (i == 0) {
            return 0;
        } else {
            return i % 10 + fn(i/10);
        }

    }
}
