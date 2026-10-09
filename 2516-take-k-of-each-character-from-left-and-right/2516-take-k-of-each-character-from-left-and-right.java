class Solution {
    public int takeCharacters(String s, int k) {
        int n= s.length();
        int freq[] = new int[3];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        if(freq[0]<k || freq[1]<k || freq[2]<k){
            return -1;
        }
        int extraA = freq[0]-k;
        int extraB = freq[1]-k;
        int extraC = freq[2]-k;
        
        int extrafreq[] = new int[3];
        int start=0;
        int maxlen=0;
        for(int end=0;end<n;end++){
            extrafreq[s.charAt(end)-'a']++;
            while(extrafreq[0]>extraA || extrafreq[1]>extraB || extrafreq[2]>extraC){
                extrafreq[s.charAt(start)-'a']--;
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
        }
        
        return n-maxlen;
    }
}
