package boj_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1085 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int ansX;
        int ansY;
        if (x > (w / 2)) {
            ansX = w - x;
        } else {
            ansX = x;
        }

        if (y > (h / 2)) {
            ansY = h - y;
        } else {
            ansY = y;
        }
        System.out.println(Math.min(ansX, ansY));

    }
}
