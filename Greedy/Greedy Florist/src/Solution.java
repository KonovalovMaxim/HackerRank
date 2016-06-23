/* Sample program illustrating input/output methods */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        int C[] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
        System.out.println(new GreedyFlorist().solution(N, K, C));
    }
}


class GreedyFlorist {
    public int solution(int N, int P, int[] price) {
        int totalPrice = 0;
        int[] flowersCount = new int[P];
        while (N > 0) {
            int countIndex = getMinIndex(flowersCount);
            int flowerIndex = getMaxIndex(price);
            totalPrice += formula(flowersCount[countIndex], price[flowerIndex]);
            flowersCount[countIndex]++;
            price[flowerIndex] = -1;
            N--;
        }
        return totalPrice;
    }


    public int getMaxIndex(int[] data) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getMinIndex(int[] data) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int formula(int flowerNum, int flowerPrice) {
        return (flowerNum + 1) * flowerPrice;
    }
}