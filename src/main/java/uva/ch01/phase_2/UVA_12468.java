package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_12468 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = bf.readLine();
            if ("-1 -1".equals(s)) break;
            String[] t = s.split(" ");
            int n = Math.abs(Integer.parseInt(t[0]) - Integer.parseInt(t[1]));
            if (n > 50) {
                n = 100 - n;
            }
            System.out.println(n);
        }
        bf.close();
    }
}
