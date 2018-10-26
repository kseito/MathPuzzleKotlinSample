package Q06

var count = 0

fun main(args: Array<String>) {

    for (i in 2..10000 step 2) {
        calculate(i, i, true)
    }
    println("Answer: $count")
}

fun calculate(originalNum: Int, num: Int, isFirst: Boolean) {
    var newNum = 0

    newNum = if (!isFirst && num == originalNum) {
        count++
        return
    } else if (!isFirst && num == 1) {
        return
    } else if (isFirst && num % 2 == 0) {
        num * 3 + 1
    } else if (num % 2 == 0) {
        num / 2
    } else {
        num * 3 + 1
    }
    calculate(originalNum, newNum, false)
}