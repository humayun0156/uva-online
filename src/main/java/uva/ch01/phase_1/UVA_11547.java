package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_11547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = (((((n * 567)/9 + 7492) * 235) / 47) - 498)/10 ;
            System.out.println(Math.abs(x%10));
        }
    }
}
