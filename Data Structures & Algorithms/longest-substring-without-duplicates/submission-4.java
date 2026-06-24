class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (!list.contains(c)){
                list.add(c);
            } else {
                len = Math.max(len, list.size());
                list.subList(0, list.indexOf(c) + 1).clear();
                list.add(c);
            }
        }
        return Math.max(len, list.size());
    }
}
