class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Character> chars = new ArrayList<>();

        for (char c : s1.toCharArray()) {
            chars.add(c);
        }

        for (int i=0; i < s2.length(); i++){
            if (chars.contains(s2.charAt(i))){
                if ((s2.length() - i) < s1.length()){
                    return false;
                }
                List<Character> tempChars = new ArrayList<>(chars);

                for (int j = i; j < i+s1.length(); j++){
                    int index = tempChars.indexOf(s2.charAt(j));
                    if (index != -1){
                        tempChars.remove(index);
                    } else {
                        break;
                    }
                }
                if (tempChars.isEmpty()){return true;}
            }
        }
        return false;
    }
}
