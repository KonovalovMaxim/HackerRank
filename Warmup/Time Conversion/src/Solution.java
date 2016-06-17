import java.util.Objects;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        System.out.println(solution(time));
    }

    public static String solution(String in) {
        String modifier = in.substring(in.length() - 2, in.length());
        String time = in.substring(0, in.length() - 2);
        String[] timeParts = time.split(":");
        if (Objects.equals(modifier, "AM")) {
            int hours = Integer.parseInt(timeParts[0]);
            return (hours == 12 ? "00" : timeParts[0]) + ":" + timeParts[1] + ":" + timeParts[2];
        } else {
            int hours = Integer.parseInt(timeParts[0]);
            if (hours != 12) {
                hours += 12;
            }
            return String.valueOf(hours) + ":" + timeParts[1] + ":" + timeParts[2];
        }
    }
}
