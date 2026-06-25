class Solution {
    public String minWindow(String s, String t) {
        if (s.contains(t)){
            return t;
        }
        String output = "";
        int left = 0;

        List<Character> tList = new ArrayList<>();
        for (Character c : t.toCharArray()){
            tList.add(c);
        }

        for (int i = 0; i < s.length(); i++){

            if (tList.contains(s.charAt(i))){
                List<Character> tempList = new ArrayList<>(tList);
                for (int j =i; j < s.length(); j++){
                    if (tempList.contains(s.charAt(j))){
                        tempList.remove(Character.valueOf(s.charAt(j)));
                        if (tempList.isEmpty()){
                            String str = s.substring(i, j+1);
                            output = (output.isEmpty() || str.length() < output.length()) ? str : output;
                        }
                    } else {
                        continue;
                    }
                }
                
            }

        }
        return output;

        
    }
}
