class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start=0,cost=0,end=0;
        int maxlen=0;
        while(end<s.length()){
            int val=Math.abs(s.charAt(end)-t.charAt(end));
            cost+=val;
            while(cost>maxCost){
               val=Math.abs(s.charAt(start)-t.charAt(start));
               cost-=val;
               start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}