package ch1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("jade", age = 35), Person("kim", age = 34))

    val oldest = persons.maxBy { it.age ?: 0 }

    println("oldest person : $oldest")
}