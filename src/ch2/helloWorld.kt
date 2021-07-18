package ch2

fun main(args: Array<String>) {
    println("Hello, world!")

    println(max(5, 10))

    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"

    val answer = 42

    val yearsToCompute = 7.5e6

    var answer2: Int
    answer2 = 42
    answer2 = 43

    val message: String
    if (answer2 % 2 == 0) {
        message = "success"
    } else {
        message = "failed"
    }

}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}

fun max(a: Int, b: Int) = if (a > b) a else b