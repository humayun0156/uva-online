package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_12289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            char[] s = sc.nextLine().toCharArray();
            if (s.length > 3) {
                System.out.println(3);
            }
            else {
                if (s[0] == 'o' && s[1] == 'n' && s[2] == 'e') System.out.println(1);
                else if (s[0] == 'o' && s[1] == 'n') System.out.println(1);
                else if (s[0] == 'o' && s[2] == 'e')System.out.println(1);
                else if (s[1] == 'n' && s[2] == 'e')System.out.println(1);

                else if (s[0] == 't' && s[1] == 'w' && s[2] == 'o') System.out.println(2);
                else if (s[0] == 't' && s[1] == 'w') System.out.println(2);
                else if (s[0] == 't' && s[2] == 'o') System.out.println(2);
                else if (s[1] == 'w' && s[2] == 'o') System.out.println(2);
            }
        }
    }
}
