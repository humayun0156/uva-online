package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_12250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            String line = sc.nextLine();
            if ("#".equals(line)) break;
            if ("".equals(line)) {
                System.out.println();
                continue;
            }
            if ("HELLO".equals(line)) {
                System.out.printf("Case %d: %s%n", count++, "ENGLISH");
            }
            else if ("HOLA".equals(line)) {
                System.out.printf("Case %d: %s%n", count++, "SPANISH");
            }
            else if ("HALLO".equals(line)) {
                System.out.printf("Case %d: %s%n", count++, "GERMAN");
            }
            else if ("BONJOUR".equals(line)) {
                System.out.printf("Case %d: %s%n", count++, "FRENCH");
            }
            else if ("CIAO".equals(line)) {
                System.out.printf("Case %d: %s%n", count++, "ITALIAN");
            }
            else if ("ZDRAVSTVUJTE".equals(line)) {
                System.out.printf("Case %d: %s%n", count++, "RUSSIAN");
            }
            else {
                System.out.printf("Case %d: %s%n", count++, "UNKNOWN");
            }
        }
    }
}
