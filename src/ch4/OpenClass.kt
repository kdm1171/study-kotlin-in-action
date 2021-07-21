package ch4

open class RichButton : Clickable {
    fun disable() {}

    open fun animate() {}

    final override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {}

    fun animateTwice() {}
}