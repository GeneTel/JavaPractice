package HW9;
 import java.util.stream.*;

public class Task1{
    public static boolean isPalindrome(String s) {
        String cleanStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        return IntStream.range(0, cleanStr.length() / 2)
                .allMatch(i -> cleanStr.charAt(i) == cleanStr.charAt(cleanStr.length() - i - 1));
    }
}

