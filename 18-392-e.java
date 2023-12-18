class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.isEmpty()) return true;
        if(t.isEmpty() || s.length()>t.length()) return false; 

        int l = 0;
        int counter = 0;
        for(int i = 0; i<t.length(); i++){
            if(s.charAt(l)==t.charAt(i)){
                counter++;
                l++;
            }
            if(counter==s.length()){
                return true;
            }
        }

        return false;
    }
}