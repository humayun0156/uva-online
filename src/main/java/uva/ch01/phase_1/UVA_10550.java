package uva.ch01.phase_1;

import java.util.Scanner;

/**
 * @author humayun
 */
public class UVA_10550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if ("0 0 0 0".equals(line)) {
                break;
            }
            String nums[] = line.split(" ");
            if (nums.length == 4) {
                int init = Integer.parseInt(nums[0]);
                int c1 = Integer.parseInt(nums[1]);
                int c2 = Integer.parseInt(nums[2]);
                int c3 = Integer.parseInt(nums[3]);

                int ans = 1080;
                ans += (init - c1) > 0 ? (init - c1) * 9 : (init - c1 + 40) * 9;
                ans += (c2 - c1) > 0 ? (c2 - c1) * 9 : (c2 - c1 + 40) * 9;
                ans += (c2 - c3) > 0 ? (c2 - c3) * 9 : (c2 - c3 + 40) * 9;
                System.out.println(ans);
            }
        }
    }
}
