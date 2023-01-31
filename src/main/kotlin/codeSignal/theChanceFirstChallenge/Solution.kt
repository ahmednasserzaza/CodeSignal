package codeSignal.theChanceFirstChallenge

fun solution(list: MutableList<String>): Double {
    val newList = list.filter { it == "a" || it == "b" }
    val numOfAs = list.count { it == "a" }.toDouble()
    return if (list == newList && list.contains("a") && list.contains("b") && list.size > 1) {
        numOfAs / list.size
    } else -1.0
}

fun main() {
    println(solution(mutableListOf("a " ,"b")))
}