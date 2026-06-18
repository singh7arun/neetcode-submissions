class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        for (String str : strs){
            boolean anagramListFound = false;
            List<String> listFound = null;
            for (List<String> list : output){
                if (isAnagram(list.get(0), str)){
                    
                    anagramListFound = true;
                    listFound = list;
                    break;
                }
                
            }
            if (!anagramListFound){
                List<String> l = new ArrayList<>();
                l.add(str);
                 output.add(l);
            }
            else listFound.add(str);
        }
        return output;
    }

    public boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    int[] charCount = new int[26];
    for (int i = 0; i < s1.length(); i++) {
        charCount[s1.toLowerCase().charAt(i) - 'a']++;
        charCount[s2.toLowerCase().charAt(i) - 'a']--;
    }
    for (int count : charCount) {
        if (count != 0) return false;
    }
    return true;
}
}
