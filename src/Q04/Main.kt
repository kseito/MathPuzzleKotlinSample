package Q04

fun main(args: Array<String>) {
    var answer = cut(20, 3, 1)
    println(answer)
    answer = cut(100, 5, 1)
    println(answer)
}

fun cut(length: Int, people: Int, current: Int): Int {
    println("Debug---> length: $length, people: $people, current: $current")
    return when {
        current >= length ->  0
        current < people -> 1 + cut(length, people, current * 2)
        else -> 1 + cut(length, people, current + people)
    }
}
