package ch2

class Person(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("jade", false)

    person.isMarried = true

    println(person.isMarried)
}