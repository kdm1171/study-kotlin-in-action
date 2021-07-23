package ch1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("jade", age = 35), Person("kim", age = 34))

    val oldest = persons.maxByOrNull{ it.age ?: 0 }

    println("oldest person : $oldest")

    val type = "type"

    if(type is String) {
        println(type.toUpperCase())
    }
}
/*

fun renderPersonList(persons: Collection<Person>) =
    createHTML().table {
        for (person in persons) {
            tr {
                td { +person.name }
                td { +person.age }
            }
        }

    }
*/
