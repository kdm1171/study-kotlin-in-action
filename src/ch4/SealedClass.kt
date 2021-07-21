package ch4

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main(args: Array<String>) {
    val expr = Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))

    println(eval(expr))
}