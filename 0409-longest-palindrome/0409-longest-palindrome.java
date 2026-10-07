class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       int count=0;
       boolean odd=false;
       if(s.length()==1){
        return 1;
       }
       for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
        
       } 
       for(char c:map.keySet()){
        if(map.get(c)%2==0){
          count+=map.get(c);
        }
        else{
            count+=map.get(c)-1;
            odd=true;
        }
       }
       if(odd){
        count++;
       }
       return count;
    }
}