package HW9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Task3 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(nums)
                .boxed()
                .collect(HashMap<Integer, Integer>::new, (m, v) -> {
                    int complement = target - v;
                    if (m.containsKey(complement)) {
                        m.put(-1, m.get(complement));
                        m.put(-2, Arrays.asList(nums).indexOf(complement));
                    }
                    m.put(v, Arrays.asList(nums).indexOf(v));
                }, Map::putAll)
                .entrySet().stream()
                .filter(e -> e.getKey() == -1 || e.getKey() == -2)
                .mapToInt(Map.Entry::getValue)
                .toArray();
    }
}
