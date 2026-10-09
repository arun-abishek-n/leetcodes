class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> l=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
           String sub= s.substring(i,i+10);
           map.put(sub,map.getOrDefault(sub,0)+1);
           if(map.get(sub)==2){
            l.add(sub);
           }
        }
        return l;
    }
}