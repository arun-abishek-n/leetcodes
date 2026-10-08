class Solution {
    public int numberOfSubstrings(String s) {
       int freq[]=new int[3];
       int start=0;
       int count=0;
       for(int end=0;end<s.length();end++){
        freq[s.charAt(end)-'a']++;
        while(freq[0]>0&& freq[1]>0&&freq[2]>0){
            count+=s.length()-end;
            freq[s.charAt(start)-'a']--;
            start++;
        }
        
       }
       return count;
    }
}