package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_12503 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                String s = bf.readLine();
                if ("LEFT".equals(s)) {
                    arr[i] = -1;
                } else if ("RIGHT".equals(s)) {
                    arr[i] = 1;
                } else {
                    int idx = Integer.parseInt(s.substring(s.lastIndexOf(" ")+1, s.length()));
                    arr[i] = arr[idx-1];
                }
            }
            System.out.println(arraySum(arr));
        }
    }

    public static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
