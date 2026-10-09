class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
    if(s.length()==1){
        return 1;
    }
      int start=0;
      int count=0;
      int maxlen=0;
      for(int end=1;end<s.length();end++){
        if(s.charAt(end)==s.charAt(end-1)){
            count++;
        }
        while(count>1){
            if(s.charAt(start)==s.charAt(start+1)){
                count--;
            }
            start++;

        }
        maxlen=Math.max(maxlen,end-start+1);


      } 
      return maxlen; 
    }
}