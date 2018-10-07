package Q02

import javax.script.ScriptEngineManager


fun main(args: Array<String>) {
    val engine = ScriptEngineManager().getEngineByName("javascript")
    for (i in 1000..9999) {
        for (j in 0 until operators.size) {
            for (k in 0 until operators.size) {
                for (l in 0 until operators.size) {
                    val str = i.toString()
                    val operatorInsertStr = str[0] + operators[j] + str[1] + operators[k] + str[2] + operators[l] + str[3]
                    val result = engine.eval(operatorInsertStr)
                    if (i.toString() == result.toString().reversed() && operatorInsertStr.length > 4) {
                        println("Answer : $i, Expression: $operatorInsertStr")
                    }
                }
            }
        }
    }
}


