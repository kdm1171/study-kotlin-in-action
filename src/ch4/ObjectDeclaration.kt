package ch4

import ch2.Person
import java.io.File

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            //...
        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

data class Employee(val name: String) {
    object NameComparator : Comparator<Employee> {
        override fun compare(p1: Employee, p2: Employee) =
            p1.name.compareTo(p2.name)
    }
}

fun main() {
    val payroll = Payroll

    payroll.allEmployees
    payroll.calculateSalary()


    println(
        CaseInsensitiveFileComparator.compare(
            File("/User"), File("/user")
        )
    )

    val files = listOf(File("/z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))


    val employees = listOf(Employee("Bob"), Employee("Jade"))

    println(employees.sortedWith(Employee.NameComparator))

}