package Q01

fun main(args: Array<String>) {
    var count = 10
    while (true) {
        if (count.toString() == count.toString().reversed() &&
                count.toString(8) == count.toString(8).reversed() &&
                count.toString(2) == count.toString(2).reversed()) {
            println("Answer : $count")
            break
        }
        count++
    }
}