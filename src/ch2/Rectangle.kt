package ch2

import java.util.*

class Rectangle(val height: Int, val width: Int) {
    val isSquare get() = height == width

}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

