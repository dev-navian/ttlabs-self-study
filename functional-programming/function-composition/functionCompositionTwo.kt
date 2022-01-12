val functionOne = {num: Int -> num + 2}

val functionTwo = { num: Int -> num * 2 }

// composed function
fun composedFunction(functionOne: (Int) -> Int, functionTwo: (Int) -> Int, value: Int ) = functionOne(functionTwo(value))

fun main() {
    val result = composedFunction(functionOne, functionTwo, 3);
    println(result)
}
