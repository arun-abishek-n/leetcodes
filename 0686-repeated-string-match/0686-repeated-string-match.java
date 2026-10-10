class Solution {
    public int repeatedStringMatch(String a, String b) {
        String rep="";
        int count=0;
        while(rep.length()<b.length()){
            rep+=a;
            count++;

        }
        if(rep.contains(b)){
            return count;

        }
        rep+=a;
        count++;
        if(rep.contains(b)){
            return count;
        }
        return -1;
    }
}