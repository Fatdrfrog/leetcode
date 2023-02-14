var maxArea = function (height) {
  let sum = 0;
  let ls = 0;
  let rs = 0;
  let li = 0;
  let ri = height.length - 1;

  const sums = [];
  for (let i = 0; i < height.length; i++) {
    if (li === ri) break;
    if (height[li] < height[ri]) {
      if (height[li] > ls) {
        ls = height[li];
      }
      sums.push(ls * (height.length - i - 1));
      li++;
    } else {
      if (height[ri] > rs) {
        rs = height[ri];
      }
      sums.push(rs * (height.length - i - 1));
      ri--;
    }
  }
  return sums.reduce((acc, curr) => (acc > curr ? acc : curr), 0);
};

console.log(maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]));
