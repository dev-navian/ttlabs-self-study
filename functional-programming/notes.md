# Functional Programming

## Immutability

The concept whereby the state of an object cannot be modified after it has been created. One convention when dealing with immutability is to create a copy of the object and make modifications to it, rather than altering the original object.

In Functional Programming, a function with the same input should always return the same result. This is the concept of Pure Functions.

[https://elizarov.medium.com/immutability-we-can-afford-10c0dcb8351d](https://elizarov.medium.com/immutability-we-can-afford-10c0dcb8351d)

[https://www.freecodecamp.org/news/write-safer-and-cleaner-code-by-leveraging-the-power-of-immutability-7862df04b7b6/](https://www.freecodecamp.org/news/write-safer-and-cleaner-code-by-leveraging-the-power-of-immutability-7862df04b7b6/)

#### Creating a new data type for an immutable array

In Java, one can use Collections.unmodifiableList() to create a data type for an immutable array.
Similarly, List.of() creates an immutable list of elements by default, which can also be used.

https://www.baeldung.com/java-immutable-list

https://stackoverflow.com/questions/3700971/immutable-array-in-java
