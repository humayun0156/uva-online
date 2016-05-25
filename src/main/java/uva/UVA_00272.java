package uva;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_00272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean n = false;

        while (sc.hasNextLine()) {
            String l = sc.nextLine();
            for (int i = 0; i < l.length(); i++) {
                if (l.charAt(i) != '\"') {
                    System.out.print(l.charAt(i));
                    continue;
                }
                n = !n;
                if (n) {
                    System.out.print("``");
                } else {
                    System.out.print("\'\'");
                }
            }
            System.out.println();
        }
    }
}

