class Solution {
    public int minSubarray(int[] nums, int p) {

        long totalsum = 0;

        for (int i=0;i<nums.length;i++) {
            totalsum = totalsum + nums[i];
        }

        int extra = (int)(totalsum % p);

        if (extra == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long sum= 0;
        int minlen = nums.length;

        for (int i = 0; i < nums.length; i++) {

            sum = sum+ nums[i];

            int currentreminder = (int)(sum % p);
            
            int required = (currentreminder - extra + p) % p;

            if (map.containsKey(required)) {
                int start = map.get(required);
                minlen = Math.min(minlen, i - start);
            }

            map.put(currentreminder, i);
        }

        return minlen == nums.length ? -1 : minlen;
    }
}
