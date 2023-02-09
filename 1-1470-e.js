var shuffle = function (nums, n) {
  const res = [];
  for (let i = 0; i < n; i++) {
    res[i * 2] = nums[i];
    res[i * 2 + 1] = nums[i + n];
  }
  return res;
};

console.log(shuffle([2, 5, 1, 3, 4, 7], 3));
// [2,3,5,4,1,7]
