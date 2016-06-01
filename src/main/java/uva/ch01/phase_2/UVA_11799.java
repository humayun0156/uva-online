package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_11799 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String t[] = in.readLine().split(" ");
            int max = 0;
            for (int j = 0; j < t.length; j++) {
                int n = Integer.parseInt(t[j]);
                if (n > max) {
                    max = n;
                }
            }
            System.out.printf("Case %d: %d%n", i+1, max);
        }
    }
}
