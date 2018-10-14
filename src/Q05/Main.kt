package Q05

var count = 0

fun main(args: Array<String>) {
    useForLoop()
    useRecursiveCall()
}

fun useForLoop() {
    var count = 0
    for (i in 0..2) {
        for (j in 0..10) {
            for (k in 0..15) {
                for (l in 0..15) {
                    val sum = i * 500 + j * 100 + k * 50 + l * 10
                    if (sum == 1000 && i + j + k + l <= 15) {
                        count++
                    }
                }
            }
        }
    }
    println("Answer: ${count}通り")
}

fun useRecursiveCall() {
    calculate(1000, mutableListOf(500, 100, 50, 10), 15)
    println("Answer: ${count}通り")
}

fun calculate(expectedSum: Int, coins: MutableList<Int>, coinNum: Int) {
    val coin = coins[0]
    coins.removeAt(0)
    if (coins.size == 0) {
        if (expectedSum / coin <= coinNum) {
            count++
        }
    } else {
        for (i in 0..expectedSum / coin) {
            calculate(expectedSum - coin * i, coins.toMutableList(), coinNum - i)
        }
    }
}
