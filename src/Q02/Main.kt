package Q02

import javax.script.ScriptEngineManager

class Main {

    companion object {
        private val operators = arrayOf("+", "-", "*", "/", "")
    }

    fun main(args: Array<String>) {
        val engine = ScriptEngineManager().getEngineByName("javascript")
//        for (i in 1000..9999) {
//            for (j in 0 until operators.size) {
//                for (k in 0 until operators.size) {
//                    for (l in 0 until operators.size) {
//                        val str = i.toString()
//                        println(str[0])
////                        val result = engine.eval("1+2")
//                    }
//                }
//            }
//        }
        val str = "hoge"
        println("$str[0],$str[1]")
    }

}

