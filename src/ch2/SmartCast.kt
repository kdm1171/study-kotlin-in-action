package ch2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr


fun eval(e: Expr): Int {
    if (e is Num) return e.value
    if (e is Sum) return eval(e.left) + eval(e.right)
    throw Exception("Invalid Expr")
}

fun eval2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval2(e.right) + eval2(e.left)
    } else {
        throw IllegalArgumentException("Unknown expr")
    }

fun eval3(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval3(e.right) + eval3(e.left)
        else -> throw IllegalArgumentException("Unknown expr")
    }

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num = ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum = $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expr")

    }

fun main(args: Array<String>) {
    val expr = Sum(Sum(Num(1), Num(2)), Num(4))
    println(eval(expr))
    println(eval2(expr))
    println(eval3(expr))
    println(evalWithLogging(expr))
}