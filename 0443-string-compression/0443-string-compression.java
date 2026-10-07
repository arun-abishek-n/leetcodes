class Solution {
    public int compress(char[] chars) {
       int i=0;
       int index=0;
       while(i<chars.length){
        int count=0;
        char ch=chars[i];
        while(i<chars.length&&ch==chars[i]){
            count++;
            i++;
        }
        chars[index++]=ch;
        if(count>1){
            StringBuilder str= new StringBuilder();
            str.append(String.valueOf(count));
            for(int j=0;j<str.length();j++){
                chars[index++]=str.charAt(j);
            }
        }
       }
       return index;
    }
}