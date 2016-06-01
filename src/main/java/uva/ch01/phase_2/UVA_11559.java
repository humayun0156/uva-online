package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author humayun
 */
public class UVA_11559 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = in.readLine();
            if(str==null || str.isEmpty()) break;
            String[] temp = str.split(" ");
            int N = Integer.parseInt(temp[0]);
            int B = Integer.parseInt(temp[1]);
            int H = Integer.parseInt(temp[2]);
            int W = Integer.parseInt(temp[3]);
            if (N <= 0 || N > 200 || B <= 0 || B > 500000 || H <= 0 || H > 18 || W <= 0 || W > 13) {
                break;
            }
            double min = Double.MAX_VALUE;
            boolean flag = false;
            for (int i = 0; i < H; i++) {
                int p = Integer.parseInt(in.readLine());
                String[] t = in.readLine().split(" ");
                for (int j = 0; j < W; j++) {
                    int a = Integer.parseInt(t[j]);
                    if (a >= N) {
                        double totalCost = N * p;
                        if (totalCost <= B ) {
                            if (min > totalCost) {
                                min = totalCost;
                                flag = true;
                            }
                        }
                    }
                }
            }
            if (flag) {
                System.out.printf("%.0f%n", min);
            } else {
                System.out.println("stay home");
            }
        }
        in.close();
    }
}
