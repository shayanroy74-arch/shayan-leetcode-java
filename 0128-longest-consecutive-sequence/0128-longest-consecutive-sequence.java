import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int maxLen = 0;

        for (int num : hs) {

            // start only if num is the beginning
            if (!hs.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (hs.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}