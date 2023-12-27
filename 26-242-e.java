class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        HashMap<String,Integer> h = new HashMap<>();
        String[] ss = s.split("");
        String[] tt = t.split("");

    for(int i = 0; i < s.length(); i++){
            h.put(ss[i], 0);
        }

        for(int i = 0; i < s.length(); i++){
            h.put(ss[i], Math.max(h.get(ss[i]) + 1, 1));
        }

        for(int i = 0; i < t.length(); i++){
            if(h.get(tt[i]) != null){
               h.put(tt[i], h.get(tt[i]) - 1);
            }

            if(h.get(tt[i]) == null || h.get(tt[i]) == -1){
                return false;
            }

         
        }

        return true;
    }
}