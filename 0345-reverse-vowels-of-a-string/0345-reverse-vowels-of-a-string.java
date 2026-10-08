class Solution {
    public String reverseVowels(String s) {
       int start=0,end=s.length()-1;
       char ch[]=s.toCharArray();
       String vow="AEIOUaeiou";
       while(start<end){
        while(start<end && vow.indexOf(ch[start])==-1){
            start++;

        }
        while(start<end&&vow.indexOf(ch[end])==-1){
            end--;
        }
        if(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
        }
        start++;
        end--;
       } 
       return new String(ch);
    }
}