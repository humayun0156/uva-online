package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_12577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true) {
            String s = sc.nextLine();
            if ("*".equals(s)) break;
            if ("Hajj".equals(s)) System.out.printf("Case %d: Hajj-e-Akbar%n", i++);
            else System.out.printf("Case %d: Hajj-e-Asghar%n", i++);
        }
    }
}
