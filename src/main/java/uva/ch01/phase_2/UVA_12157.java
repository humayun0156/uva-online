package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_12157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int c = 1;
        while (T-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            String[] t = bf.readLine().split(" ");
            int a[] = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                a[i] = Integer.parseInt(t[i]);
            }
            int m = 0, j = 0;
            for (int i = 0; i < a.length; i++) {
                m += (a[i] + 30) / 30;
                j += (a[i] + 60) / 60;
            }
            m *= 10;
            j *= 15;

            if ( m > j ) {
                System.out.printf("Case %d: Juice %d%n",c++, j);
            } else if (j > m) {
                System.out.printf("Case %d: Mile %d%n", c++, m);
            } else {
                System.out.printf("Case %d: Mile Juice %d%n", c++, m);
            }
        }
        bf.close();
    }

}
