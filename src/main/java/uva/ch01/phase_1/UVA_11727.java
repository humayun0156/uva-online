package uva.ch01.phase_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_11727 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while (t-- > 0) {
            int arr[] = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            System.out.printf("Case %d: %d\n", i++, arr[1]);
        }
    }

}
