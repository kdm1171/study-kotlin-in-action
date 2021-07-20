package ch3

open class View {
    open fun click() = println("view Clicked")
}

class Button: View() {
    override fun click() = println("button clicked")
}

fun View.showOff() = println("view")

fun Button.showOff() = print("button")

fun main(args: Array<String>) {
    val view : View = Button()
    view.click()
    view.showOff()
}