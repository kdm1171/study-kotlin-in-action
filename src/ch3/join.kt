@file:JvmName("StringFunctions")

package strings

@JvmOverloads
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

//fun String.lastChar(): Char = this.get(this.length - 1)
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    val s = "Hello"
    println(s.lastChar)

    val list = listOf(1, 2, 3)
    println(list.joinToString())

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}