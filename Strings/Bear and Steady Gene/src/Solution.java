import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String sequence = scanner.next();
        System.out.println(new BearAndSteadyGene().solution(sequence));
    }
}

class BearAndSteadyGene {

    public int solution(String sequence) {
        int[] a = new int[sequence.length()];
        for (int i = 0; i < sequence.length(); i++) {
            a[i] = "ACTG".indexOf(sequence.charAt(i));
        }
        int[] target = new int[4];

        for (int i = 0; i < target.length; i++) {
            int finalI = i;
            target[i] = (int) Math.max(0, IntStream.of(a).filter(aa -> aa == finalI).count() - sequence.length() / 4);
        }
        if (IntStream.of(target).allMatch(i -> i == 0)) {
            return 0;
        }
        int answer = sequence.length();
        int left = 0;
        int right = 0;
        int[] sums = new int[4];
        while (right < sequence.length()) {
            sums[a[right]]++;
            right++;
            while (right < sequence.length() && !(checkSum(sums, target))) {
                sums[a[right]]++;
                right++;
            }
            while (left < right) {
                if (!checkSum(sums, target)) {
                    break;
                }
                sums[a[left]]--;
                left++;
            }
            answer = Math.min(answer, right - left + 1);
        }
        return answer;
    }

    private static boolean checkSum(int[] sum, int[] target) {
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] < target[i]) {
                return false;
            }
        }
        return true;
    }
}