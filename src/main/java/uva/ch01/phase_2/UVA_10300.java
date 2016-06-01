package uva.ch01.phase_2;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_10300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ft = sc.nextInt();
            double total = 0;
            for (int i = 0; i < ft; i++) {
                int size = sc.nextInt();
                int animal = sc.nextInt();
                int env = sc.nextInt();
                total += (size * env);
            }
            System.out.printf("%.0f%n",total);
        }
    }
}
