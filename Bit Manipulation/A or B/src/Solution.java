import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        try {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
                int counter = 0;
                int k = 0;
                BigInteger a = new BigInteger("0");
                BigInteger b = new BigInteger("0");
                BigInteger c = new BigInteger("0");
                for (String line; (line = br.readLine()) != null; ) {
                    switch ((counter - 1) % 4) {
                        case 0:
                            k = Integer.parseInt(line);
                            break;
                        case 1:
                            a = new BigInteger(line, 16);
                            break;
                        case 2:
                            b = new BigInteger(line, 16);
                            break;
                        case 3:
                            c = new BigInteger(line, 16);
                            BigInteger[] result = new AorB().solution(k, a, b, c);
                            if (result.length == 0) {
                                System.out.println("-1");
                            } else {
                                System.out.println(result[0].toString(16).toUpperCase());
                                System.out.println(result[1].toString(16).toUpperCase());
                            }
                            break;
                    }
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static BigInteger[] solution(int k, BigInteger a, BigInteger b, BigInteger c) {
        return new AorB().solution(k, a, b, c);
    }
}

class AorB {
    //cant handle with speed BigInteger is too slow
    public BigInteger[] solution(int k, BigInteger a, BigInteger b, BigInteger c) {
        int length = Math.max(a.toString(2).length(), b.toString(2).length());
        length = Math.max(length, c.toString(2).length());
        String aData = toString(a, length);
        String bData = toString(b, length);
        String cData = toString(c, length);
        String resultA = "";
        String resultB = "";
        for (int i = 0; i < cData.length(); i++) {
            if (cData.charAt(i) == '0') {
                resultA += '0';
                resultB += '0';
                if (aData.charAt(i) == '1') {
                    k--;
                }
                if (bData.charAt(i) == '1') {
                    k--;
                }
            } else {
                if (aData.charAt(i) == '0' && bData.charAt(i) == '0') {
                    resultA += '0';
                    resultB += '1';
                    k--;
                } else {
                    resultA += aData.charAt(i);
                    resultB += bData.charAt(i);
                }
            }
            if (k < 0) {
                return new BigInteger[]{};
            }
        }

        for (int i = 0; i < cData.length(); i++) {
            if (k <= 0) {
                break;
            }
            if (resultA.charAt(i) == '1' && resultB.charAt(i) == '0' && k > 1) {
                StringBuilder asb = new StringBuilder(resultA);
                asb.setCharAt(i, '0');
                resultA = asb.toString();

                StringBuilder bsb = new StringBuilder(resultB);
                bsb.setCharAt(i, '1');
                resultB = bsb.toString();
                k -= 2;
            } else if (resultA.charAt(i) == '1' && resultB.charAt(i) == '1' && k > 0) {
                StringBuilder asb = new StringBuilder(resultA);
                asb.setCharAt(i, '0');
                resultA = asb.toString();
                k--;
            }
        }
        return new BigInteger[]{new BigInteger(resultA, 2), new BigInteger(resultB, 2)};
    }

    private String toString(BigInteger number, int length) {
        String binary = number.toString(2);
        int binaryLength = binary.length();
        for (int i = 0; i <= length - binaryLength; i++) {
            binary = '0' + binary;
        }
        return binary;
    }
}