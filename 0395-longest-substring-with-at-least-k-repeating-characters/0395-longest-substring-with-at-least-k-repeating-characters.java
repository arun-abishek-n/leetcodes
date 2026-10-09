class Solution {
    public int longestSubstring(String s, int k) {
        int maxlen=0;
        for(int alpha=1;alpha<=26;alpha++){
        int freq[]=new int[26];
        int start=0;
        int countalpha=0;
        int valid=0;
        for(int end=0;end<s.length();end++){
            int index=s.charAt(end)-'a';
            if(freq[index]==0){
                countalpha++;
            }
            freq[index]++;
            if(freq[index]==k){
                valid++;
            }
            while(countalpha>alpha){
                int remove = s.charAt(start)-'a';
                if(freq[remove]==k){
                    valid--;
                }
                freq[remove]--;
                if(freq[remove]==0){
                    countalpha--;
                }
                start++;
            }
            if(countalpha==alpha && valid==alpha){
                maxlen=Math.max(maxlen,end-start+1);
            }
        }
        
        
        }
        return maxlen;
    }
}