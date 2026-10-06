class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
               List<List<String>> answer = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            int freq[]=new int[26];
            for(int j=0;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
            }
            String key = Arrays.toString(freq);
            if(!map.containsKey(key)){
                List<String> l = new ArrayList<>();
                map.put(key,l);
            }
            map.get(key).add(s);
        }
        
        for(String k:map.keySet()){
            answer.add(map.get(k));
        }
        return answer;
    }
}