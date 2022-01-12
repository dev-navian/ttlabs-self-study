// reduce function higher order function taking a reducer function, an initial accumulator value and a list of integers for computation
fun reduce(reducerFunction: (Int, Int) -> Int, initial: Int, array: List<Int>): Int {
    var accumulator = initial

    for (item: Int in array) {
        accumulator = reducerFunction(accumulator, item)
    }

    return accumulator
}

// reducer function
val reducer = { acc: Int, curr: Int -> acc + curr }

fun main() {
    val result = reduce(reducer, 0, listOf<Int>(3, 4, 5, 6, 7, 8))
    // OR
    // val result = reduce({ acc: Int, curr: Int -> acc + curr }, 0, listOf<Int>(3, 4, 5, 6, 7, 8))
    
    println(result)
}