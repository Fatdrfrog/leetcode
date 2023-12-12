/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
  nums.sort((a, b) => a - b);
  let max = nums[0];
  let counter = 0;
  let maxC = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === nums[i + 1]) {
      counter++;
    } else if (nums[i] !== nums[i + 1]) {
      if (maxC < counter) {
        maxC = counter;
        max = nums[i];
      }
      counter = 0;
    }
  }

  return max;
};
