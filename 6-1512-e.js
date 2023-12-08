/**
 * @param {number[]} nums
 * @return {number}
 */

const nFactorial = (n) => {
  if (n < 1) return 1;
  return nFactorial(n - 1) * n;
};

var numIdenticalPairs = function (nums) {
  const obj = {};

  for (let i = 0; i < nums.length; i++) {
    obj[nums[i]] = obj[nums[i]] ? obj[nums[i]] + 1 : 1;
  }

  let counter = 0;
  for (const key in obj) {
    if (obj[key] > 1) {
      counter = counter + (nFactorial(obj[key]) / (2 * nFactorial(obj[key] - 2)));
    }
  }
  return counter;
};

const res = numIdenticalPairs([1, 1,1, 1]);

