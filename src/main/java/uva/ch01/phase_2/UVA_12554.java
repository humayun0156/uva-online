package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_12554 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = {
                "Happy", "birthday", "to", "you",
                "Happy", "birthday", "to", "you",
                "Happy", "birthday", "to", "Rujia",
                "Happy", "birthday", "to", "you",
        };
        int T = Integer.parseInt(bf.readLine());
        String names[] = new String[T];
        for (int i = 0; i < names.length; i++) {
            names[i] = bf.readLine();
        }

        boolean pDone = false, sDone = false;
        int i  = 0, j = 0;
        while (true) {
            if (i == names.length) pDone = true;
            if (j == s.length) sDone = true;
            if (pDone && sDone && j % 16 == 0) break;

            System.out.println(names[i%names.length] + ": " + s[j%s.length]);
            i++; j++;
        }
        bf.close();
    }
}
