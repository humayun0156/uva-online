package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_11498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int k = sc.nextInt();
            if (k == 0) break;
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int x1 = x - n;
                int y1 = y - m;
                if (x1 > 0 && y1 > 0) {
                    System.out.println("NE");
                    continue;
                }
                if (x1 > 0 && y1 < 0) {
                    System.out.println("SE");
                    continue;
                }
                if (x1 < 0 && y1 > 0) {
                    System.out.println("NO");
                    continue;
                }
                if (x1 < 0 && y1 < 0) {
                    System.out.println("SO");
                    continue;
                }
                if (x1 == 0 || y1 == 0) {
                    System.out.println("divisa");
                }

            }

        }
    }
}
