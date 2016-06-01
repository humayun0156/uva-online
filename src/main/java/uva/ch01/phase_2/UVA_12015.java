package uva.ch01.phase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 * @author humayun
 */
public class UVA_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        String str;
        Vector<String> url = new Vector<>();
        Vector<Integer> rank = new Vector<>();
        while (true) {
            str = in.readLine();
            if (str == null || str.isEmpty()) break;
            String[] tmp = str.split(" ");

            url.add(tmp[0]);
            rank.add(Integer.parseInt(tmp[1]));
        }

        for (int i = 0; i < rank.size()/10; i++) {
            Vector<String> urlSet = new Vector<>();
            int max = rank.get(i*10);
            urlSet.add(url.get(i * 10));
            for (int j = 0; j < 10; j++) {
                String l = url.get(i * 10 + j);
                if (rank.get(i*10 + j) > max) {
                    urlSet.clear();
                    if (!urlSet.contains(l))
                        urlSet.add(l);
                    max = rank.get(i*10 + j);
                } else if (rank.get(i*10 + j) == max) {
                    if (!urlSet.contains(l))
                        urlSet.add(l);
                }
            }

            System.out.printf("Case #%d:%n", i + 1);
            for (String link : urlSet) {
                System.out.println(link);
            }
        }
    }
}
