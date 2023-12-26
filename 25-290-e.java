class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<String, String> h = new HashMap<>();
        HashMap<String, String> h2 = new HashMap<>();

        String[] p = pattern.split("");
        String[] ss = s.split(" ");

        if (p.length != ss.length) return false;

        for(int i = 0; i < p.length; i++){
            if(h.get(p[i]) == null){
                h.put(p[i], ss[i]);
            }
            if(h2.get(ss[i]) == null){
                h2.put(ss[i], p[i]);
            }
            if(!h.get(p[i]).equals(ss[i]) || !h2.get(ss[i]).equals(p[i])){
                return false;
            }
        }
        return true;
    }
}