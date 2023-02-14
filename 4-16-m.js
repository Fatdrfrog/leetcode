var threeSumClosest = function (nums, target) {
  nums.sort((a, b) => a - b);

  let res = Infinity;
  for (let i = 0; i < nums.length - 2; i++) {
    let l = i + 1;
    let r = nums.length - 1;

    while (l < r) {
      let newSum = nums[l] + nums[r] + nums[i];
      if (Math.abs(newSum - target) < Math.abs(res - target)) res = newSum;
      else if (newSum > target) r--;
      else l++;
    }
  }
  return res;
};

console.log(threeSumClosest([-1, 2, 1, -4], 1));
