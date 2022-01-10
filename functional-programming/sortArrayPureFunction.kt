fun main() {
    sortArrayPureFunction(intArrayOf(3, 1, 5, 7, 3, 2, 9))
}

fun sortArrayPureFunction(array: IntArray) {
    val copiedArray = array.copyOf();

    val sortedArray = copiedArray.sorted();

    println(sortedArray.joinToString)
}