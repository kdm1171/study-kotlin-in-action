package ch4.constructor

import javax.naming.Context
import javax.print.attribute.AttributeSet
import javax.print.attribute.HashAttributeSet

open class View {
    constructor(ctx: Context)

    constructor(ctx: Context, attr: AttributeSet)
}

class MyButton : View {
    constructor(ctx: Context)
            : super(ctx) {
        //...
    }

    constructor(ctx: Context, attr: AttributeSet)
            : super(ctx, attr) {
        //...
    }
}

val MY_STYLE: AttributeSet = HashAttributeSet()

class MyView : View {
    constructor(ctx: Context) : this(ctx, MY_STYLE)

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
}