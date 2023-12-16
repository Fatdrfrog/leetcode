class Solution {
    public boolean isPalindrome(String s) {
        
      String[] newArr = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "").split("");
        int l = 0;
        int r = newArr.length-1;

        for(int i = 0; i < newArr.length/2; i++){
            if(!newArr[l].equals(newArr[r])==true) {
                return false;
            }
            l++;
            r--;
        }
 
        return true;
    }
}