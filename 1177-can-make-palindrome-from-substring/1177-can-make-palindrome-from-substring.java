class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        
		List<Boolean> result = new ArrayList<>();

		int[][] prefix = new int[s.length() + 1][26];

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < 26; j++) {
				prefix[i + 1][j] = prefix[i][j];
			}

			prefix[i + 1][s.charAt(i) - 'a']++;
		}

		for(int i=0; i<queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			int k = queries[i][2];

			int odd = 0;

			for (int j = 0; j < 26; j++) {

				int count = prefix[end + 1][j] - prefix[start][j];

				if (count % 2 != 0) {
					odd++;
				}
			}

			if (odd / 2 <= k) {
				result.add(true);
			} else {
				result.add(false);
			}
		}

		return result;
    }
}