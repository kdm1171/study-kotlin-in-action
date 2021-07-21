package ch4

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

//    override fun showOff() {
//        super<Focusable>.showOff()
//        super<Clickable>.showOff()
//    }

    override fun showOff() = super<Clickable>.showOff()
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val btn = Button()

    btn.showOff()
    btn.setFocus(true)
    btn.click()
}