# Functional Programming

## Immutability

The concept whereby the state of an object cannot be modified after it has been created. One convention when dealing with immutability is to create a copy of the object and make modifications to it, rather than altering the original object.

In Functional Programming, a function with the same input should always return the same result. This is the concept of Pure Functions.

[article on Medium](https://elizarov.medium.com/immutability-we-can-afford-10c0dcb8351d)

[article on FreeCodeCamp](https://www.freecodecamp.org/news/write-safer-and-cleaner-code-by-leveraging-the-power-of-immutability-7862df04b7b6/)

#### Creating a new data type for an immutable array

In Java, one can use Collections.unmodifiableList() to create a data type for an immutable array.
Similarly, List.of() creates an immutable list of elements by default, which can also be used.

[article on Baeldung](https://www.baeldung.com/java-immutable-list)

[StackOverflow](https://stackoverflow.com/questions/3700971/immutable-array-in-java)

### Higher Order Functions

Simply defined, a higher order function is a function which takes another function as an argument, or a function which returns another function.

[article on Medium](https://medium.com/javascript-scene/higher-order-functions-composing-software-5365cf2cbe99#:~:text=A%20higher%20order%20function%20is,return%20a%20function%20as%20output.&text=Both%20of%20them%20take%20a,re%20both%20higher%20order%20functions)
