import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String resStr = replaceSpaces(s);
        System.out.println(resStr);
    }

    private static String replaceSpaces(String s) {
        char[] sArr = s.toCharArray();
        StringBuilder resultingString = new StringBuilder();
        for (char charInStr : sArr) {
            if (charInStr == ' ') {
                resultingString.append("%20");
            } else {
                resultingString.append(charInStr);
            }
        }
        return resultingString.toString();

    }
}
