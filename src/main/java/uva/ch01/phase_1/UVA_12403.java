package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_12403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int total = 0;
        while (t-- > 0) {
            String l = sc.nextLine();
            String[] arr = l.split(" ");
            if ("donate".equals(arr[0])) {
                total += Integer.parseInt(arr[1]);
            } else {
                System.out.println(total);
            }
        }
    }
}
