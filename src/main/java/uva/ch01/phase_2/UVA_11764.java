package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_11764 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(in.readLine());
            String t[] = in.readLine().split(" ");
            int high = 0;
            int low = 0;
            for (int j  = 0; j < N-1; j++) {
                int curr = Integer.parseInt(t[j]);
                int next = Integer.parseInt(t[j+1]);
                if (curr > next) {
                    low++;
                }
                else if (curr < next) {
                    high++;
                }
            }
            System.out.printf("Case %d: %d %d%n", i+1, high, low );
        }
    }
}
