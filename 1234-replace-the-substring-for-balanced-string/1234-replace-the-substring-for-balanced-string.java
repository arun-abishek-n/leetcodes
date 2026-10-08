class Solution {
	public int balancedString(String s) { 
		int n = s.length(); 
		int need = n/4; 
		HashMap<Character,Integer> map = new HashMap<>(); 
		for(int i=0; i<n; i++) { 
			char c = s.charAt(i); 
			map.put(c,map.getOrDefault(c,0)+1); 
		} 
		int start=0; 
		int minlen=n; 
		for(int end=0; end<n; end++) { 
			char c = s.charAt(end); 
			map.put(c,map.get(c)-1); 
			while(start<n &&
				  map.getOrDefault('Q',0)<=need && 
				  map.getOrDefault('W',0)<=need && 
				  map.getOrDefault('E',0)<=need && 
				  map.getOrDefault('R',0)<=need) { 
				minlen = Math.min(minlen,end-start+1); 
				map.put(s.charAt(start),map.get(s.charAt(start))+1); 
				start++; 
			} 
		}
		return minlen; 
	} 
}