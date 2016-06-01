package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_12279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCount = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int tc = 0;
            int tgc = 0;
            for (int i = 0; i < n; i++) {
                int j = sc.nextInt();
                if (j == 0) {
                    tgc++;
                } else {
                    tc++;
                }
            }
            System.out.printf("Case %d: %d%n", caseCount++, tc - tgc);
        }
    }
}
