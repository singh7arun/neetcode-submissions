class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int start = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        int maxLen = 0;

        for(int end = 0; end < s.length(); end++)
        {
            charFreq.put(s.charAt(end), charFreq.getOrDefault(s.charAt(end), 0) + 1);
            maxFreq = Math.max(maxFreq, charFreq.get(s.charAt(end)));

            while((end - start + 1) - maxFreq > k){
                charFreq.put(s.charAt(start), charFreq.get(s.charAt(start)) - 1);
                start++;
            }
            maxLen = Math.max(maxLen, (end - start + 1));
        }

        return maxLen;
    }
}