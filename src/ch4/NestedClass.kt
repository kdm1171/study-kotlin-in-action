package ch4

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State

    fun restoreState(state: State)
}

class ButtonWithState : View {
    override fun getCurrentState(): State {
        TODO("Not yet implemented")
    }

    override fun restoreState(state: State) {
        TODO("Not yet implemented")
    }

    class ButtonState : State
}


class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

