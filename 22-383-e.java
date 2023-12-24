class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> h = new HashMap<>();
    
        String[] mags = magazine.split("");
        String[] rags = ransomNote.split("");

        for(int i = 0; i < magazine.length(); i++){
            h.put(mags[i], 0);
        }

        for(int i = 0; i < magazine.length(); i++){
            h.put(mags[i], Math.max(h.get(mags[i]) + 1, 1));
        }

        for(int i = 0; i < ransomNote.length(); i++){
           Integer c =  h.get(rags[i]);
            if(c != null){
                 h.put(rags[i],h.get(rags[i]) - 1); 
            }
           if(c == null || c == 0){
              return false;
            }
        }
        return true;
    }
}