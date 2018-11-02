package Q08

import java.awt.Point

private const val DEPTH = 12
private val DIRECTION = arrayListOf(Point(1, 0), Point(0, 1), Point(-1, 0), Point(0, -1))

fun main(args: Array<String>) {
    val points = mutableListOf(Point(0, 0))

    val result = move(points)
    println(result)
}

fun move(points: MutableList<Point>): Int {

    var count = 0

    if (points.size == DEPTH + 1) {
        return 1
    }

    val currentPosition = points.getCurrentPosition()
    DIRECTION.forEach {
        val newPosition = Point(currentPosition.x + it.x, currentPosition.y + it.y)
        if (!points.contains(newPosition)) {
            val newPoints = points.toMutableList()
            newPoints.add(newPosition)
            count += move(newPoints)
        }
    }
    return count
}

fun MutableList<Point>.getCurrentPosition(): Point {
    return this[this.size - 1]
}
