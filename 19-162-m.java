class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];

        int l = 0;
        int r = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[l] + numbers[r] == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                break;
            }

            if (numbers[l] + numbers[r] < target) {
                l++;
            }
            if (numbers[l] + numbers[r] > target) {
                r--;
            }
        }
        return res;
    }
}