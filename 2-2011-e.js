var finalValueAfterOperations = function (operations) {
  let counter = 0;
  operations.forEach((el) => {
    if (el.includes("+")) counter++;
    else counter--;
  });
  return counter;
};

console.log(finalValueAfterOperations(["++X", "++X", "X++"]));
