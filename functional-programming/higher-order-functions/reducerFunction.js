// higher order reduce function illustration in JS
// the function takes as its first argument a reducing function which is defined below, an initial accumulator value and a given array for computation

const reduce = (reducerFunction, initial, array) => {
  let accumulator = initial;
  let { length } = array;

  for (let i = 0; i < length; i++) {
    accumulator = reducerFunction(accumulator, array[i]);
  }

  return accumulator;
};

// reducer function defined and stored in a variable
// [ (acc, curr) => acc + curr ]  -> is an anonymous function definition stored in the reducer variable
const result = reduce((acc, curr) => acc + curr, 0, [2, 3, 4, 5]);

console.log(result);
