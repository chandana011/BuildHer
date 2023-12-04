//Medium----->example2
//Question-->
//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import  java.util.List;

public class MajorityELements {
    public static List<Integer> majorityElements(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element in the array
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int n = nums.size();
        int threshold = n / 3;  //condition

        // Check if each element appears more than n/3 times
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            nums.add(Integer.parseInt(element));
        }

        List<Integer> result = majorityElements(nums);

        System.out.println(result);
    }
}
