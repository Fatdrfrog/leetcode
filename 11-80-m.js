/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let n = 0;
  for (let i = 0; i < nums.length; i++) {
    if (n === 0 || n === 1 || nums[n - 2] !== nums[i]) {
      nums[n] = nums[i];
      n++;
    }
  }

  console.log(nums);
  return n;
};

console.log(removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3]));
