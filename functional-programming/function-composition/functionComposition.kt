fun main() {
    val composedResult = composition(4)
    println(composedResult)
}

// composed function
fun composition(num: Int) = funOne(funTwo(num))

fun funOne(num: Int) : Int = num + 2
fun funTwo(num: Int): Int = num * 2

