class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      int start=0,t=0,f=0;
      int maxlen=0;
      for(int end=0;end<answerKey.length();end++){
        if(answerKey.charAt(end)=='T'){
            t++;
        }
        else{
            f++;
        }
        while(t>k&&f>k){
            if(answerKey.charAt(start)=='T'){
                t--;
            }
            else{
                f--;
            }
            start++;
        }
        maxlen=Math.max(maxlen,end-start+1);
      }  
      return maxlen;
    }
}