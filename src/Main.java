import HW9.Task1;
import HW9.Task2;

import java.util.Arrays;

import static HW9.Task3.twoSum;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";


        System.out.println("Is \"" + input1 + "\" a palindrome? " + Task1.isPalindrome(input1));

        System.out.println("Is \"" + input2 + "\" a palindrome? " + Task1.isPalindrome(input2));

        System.out.println("Is \"" + input3 + "\" a palindrome? " + Task1.isPalindrome(input3));

        //Task2
        Task2 solution = new Task2();

        int[] numbers1 = {1, 2, 3, 1};
        System.out.println("Input: nums = " + Arrays.toString(numbers1));
        System.out.println("Output: " + solution.containsDuplicate(numbers1));

        int[] numbers2 = {1, 2, 3, 4};
        System.out.println("Input: nums = " + Arrays.toString(numbers2));
        System.out.println("Output: " + solution.containsDuplicate(numbers2));

        int[] numbers3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Input: nums = " + Arrays.toString(numbers3));
        System.out.println("Output: " + solution.containsDuplicate(numbers3));

        //Task3
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output 1: " + Arrays.toString(result1)); // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output 2: " + Arrays.toString(result2)); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Output 3: " + Arrays.toString(result3)); // Output: [0, 1]
    }
}

