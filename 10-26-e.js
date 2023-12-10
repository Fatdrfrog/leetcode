/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let k = 0;
  let l = 1;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] !== nums[i + 1]) {
      k++;
      nums[l] = nums[i + 1];
      l++;
    }
  }

  return k;
};
