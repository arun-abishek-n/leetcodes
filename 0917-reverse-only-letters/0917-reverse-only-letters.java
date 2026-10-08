class Solution {
    public String reverseOnlyLetters(String s) {
      char ch[]=s.toCharArray();
      int start=0,end=ch.length-1;
      while(start<end){
        while(start<end && !Character.isLetter(ch[start])){
           start++;

        }
         while(start<end && !Character.isLetter(ch[end])){
           end--;

        }
         char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
      }
      return new String(ch);
    }
}