package Q07

import java.time.LocalDateTime

fun main(args: Array<String>) {
    var from = LocalDateTime.of(1964, 10, 10, 0, 0)
    val to = LocalDateTime.of(2020, 7, 24, 0, 0)

    while (!from.isEqual(to)) {

        printIfAppropriated(from)
        from = from.plusDays(1)
    }
}

fun printIfAppropriated(localDateTime: LocalDateTime) {
    val dateNum = localDateTime.year * 10000 + localDateTime.monthValue * 100 + localDateTime.dayOfMonth
    val calculatedValue = dateNum.toString(2).reversed()
    if (dateNum.toString(2) == calculatedValue) {
        println(dateNum)
    }
}