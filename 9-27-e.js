/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */

var removeElement = function (nums, val) {
    let r = nums.length - 1;
    let k = 0;
    for (let i = nums.length - 1; i >= 0; i--) {
      if (nums[i] === val) {
        nums[i] = nums[r];
        r--;
      } else {
        k++;
      }
    }
    return k;
  };
  