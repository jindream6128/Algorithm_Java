import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    static boolean[] used;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[1_000_001];
        int now = 1;
        int count = 0;
        nums[1] = 1;
        used = new boolean[10];
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            if (n < now) {
                System.out.println(nums[n]);
                continue;
            }
            while(now <= n) {
                count++;
                if (check(count)) {
                    nums[now++] = count;
                }
            }
            System.out.println(nums[n]);
        }
    }
    public static boolean check(int num) {
        for(int i = 0; i < 10; i++) {
            used[i] = false;
        }
        while(num > 0) {
            if (used[num % 10]) {
                return false;
            }
            used[num % 10] = true;
            num /= 10;
        }
        return true;
    }
}