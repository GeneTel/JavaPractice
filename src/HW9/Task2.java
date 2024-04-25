package HW9;

import java.util.Arrays;

public class Task2 {
    public  boolean containsDuplicate(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
}
}
