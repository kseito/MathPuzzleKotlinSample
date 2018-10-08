package Q03

fun main(args: Array<String>) {
    val coinArray = BooleanArray(100)

    for (cardNum in 1 .. 99) {
        for(openNum in cardNum until  100 step cardNum + 1) {
            coinArray[openNum] = !coinArray[openNum]
        }
    }

    for(i in 0 until 100) {
        if (!coinArray[i]) {
            println(i + 1)
        }
    }
}