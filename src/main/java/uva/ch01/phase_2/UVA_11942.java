package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_11942 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());
        System.out.println("Lumberjacks:");
        for (int i = 0; i < T; i++) {
            String t[] = in.readLine().split(" ");
            boolean flag = true;
            int arr[] = new int[t.length];
            for (int j = 0; j < t.length; j++) {
                arr[j] = Integer.parseInt(t[j]);
            }

            if (isAsc(arr) || isDesc(arr)) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }
        in.close();

    }

    public static boolean isAsc(int a[]) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDesc(int a[]) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }

}
