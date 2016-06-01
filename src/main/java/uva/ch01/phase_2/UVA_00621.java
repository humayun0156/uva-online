package uva.ch01.phase_2;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_00621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            int len = arr.length;
            if ("1".equals(s) || "4".equals(s) || "78".equals(s)) {
                System.out.println("+");
            }
            else if(len >= 2 && arr[len-2] == '3' && arr[len-1] == '5') {
                System.out.println("-");
            }
            else if (len >= 2 && arr[0] == '9' && arr[len-1] == '4') {
                System.out.println("*");
            }
            else {
                System.out.println("?");
            }
        }
    }
}
