import java.util.*;

class Solution {
    public String longestDupSubstring(String s) {
        int n = s.length();
        int low = 1, high = n - 1;
        int start = -1, maxLen = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int idx = check(s, mid);

            if (idx != -1) {
                start = idx;
                maxLen = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return maxLen == 0 ? "" : s.substring(start, start + maxLen);
    }

    private int check(String s, int len) {
        long base = 26;
        long mod = 1_000_000_007L;
        long power = 1;

        for (int i = 1; i < len; i++) {
            power = (power * base) % mod;
        }

        long hash = 0;

        for (int i = 0; i < len; i++) {
            hash = (hash * base + (s.charAt(i) - 'a')) % mod;
        }

        HashMap<Long, List<Integer>> map = new HashMap<>();
        map.computeIfAbsent(hash, k -> new ArrayList<>()).add(0);

        for (int i = len; i < s.length(); i++) {
            hash = (hash - (s.charAt(i - len) - 'a') * power % mod + mod) % mod;
            hash = (hash * base + (s.charAt(i) - 'a')) % mod;

            int start = i - len + 1;

            if (map.containsKey(hash)) {
                for (int prev : map.get(hash)) {
                    if (s.regionMatches(prev, s, start, len)) {
                        return start;
                    }
                }
            }

            map.computeIfAbsent(hash, k -> new ArrayList<>()).add(start);
        }

        return -1;
    }
}