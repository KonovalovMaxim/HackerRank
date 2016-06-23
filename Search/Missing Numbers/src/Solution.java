import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aLength = scanner.nextInt();
        int[] A = new int[aLength];
        for (int i = 0; i < aLength; i++) {
            A[i] = scanner.nextInt();
        }
        int bLength = scanner.nextInt();
        int[] B = new int[bLength];
        for (int i = 0; i < bLength; i++) {
            B[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = solution(A, B);
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static ArrayList<Integer> solution(int[] A, int[] B) {
        HashMap<Integer, Integer> mapA = countElements(A);
        HashMap<Integer, Integer> mapB = countElements(B);
        ArrayList<Integer> result = new ArrayList<>();
        if (A.length < B.length) {
            for (Map.Entry<Integer, Integer> entry : mapB.entrySet()) {
                Integer AElement = mapA.get(entry.getKey());
                int start = 0;
                if (AElement != null) {
                    start = AElement;
                }
                int end = entry.getValue();
                if (start != end && !result.contains(entry.getKey())) {
                    result.add(entry.getKey());
                }
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : mapA.entrySet()) {
                Integer AElement = mapA.get(entry.getKey());
                int start = 0;
                if (AElement != null) {
                    start = AElement;
                }
                int end = entry.getValue();
                for (int i = start; i < end; i++) {
                    result.add(entry.getKey());
                }
            }
        }
        return result;
    }

    private static HashMap<Integer, Integer> countElements(int[] data) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            Integer count = result.get(data[i]);
            if (null == count) {
                result.put(data[i], 1);
            } else {
                result.put(data[i], count + 1);
            }
        }
        return result;
    }
}
