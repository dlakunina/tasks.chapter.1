import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        if (isClose(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean isClose(String s1, String s2) {
        char[] sArr1 = s1.toCharArray();
        char[] sArr2 = s2.toCharArray();
        int commonPrefLength = findComPrefLength(sArr1, sArr2);
        int commonSufLength = findComSufLength(sArr1, sArr2, commonPrefLength);

        String diff1 = s1.substring(commonPrefLength, s1.length() - commonSufLength);
        String diff2 = s2.substring(commonPrefLength, s2.length() - commonSufLength);

        if ((diff1.length() > 1) || (diff2.length() > 1)) {
            return false;
        } else {
            return true;
        }
    }


    public static int findComPrefLength(char[] sArr1, char[] sArr2) {
        int maxPrefixLen = Math.min(sArr1.length, sArr2.length);
        for (int i = 0; i <= maxPrefixLen - 1; i++) {
            if (sArr1[i] != sArr2[i]) {
                return i;
            }
        }
        return maxPrefixLen;
    }

    public static int findComSufLength(char[] sArr1, char[] sArr2, int start) {
        int maxSuffixLen = Math.min(sArr1.length - start, sArr2.length - start);
        for (int suffixLen = 0; suffixLen <= maxSuffixLen - 1; suffixLen++) {
            int i1 = sArr1.length - suffixLen - 1;
            int i2 = sArr2.length - suffixLen - 1;
            if (sArr1[i1] != sArr2[i2]) return suffixLen;
        }
        return maxSuffixLen;
    }


}
