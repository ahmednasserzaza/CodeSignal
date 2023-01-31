package codeSignal.theChanceFirstChallenge

fun solution(list: List<String>) = if ("a" in list && "b" in list && list.all { it == "a" || it == "b" })
    list.count { it == "a" } / list.size.toDouble() else -1.0

fun main() {
    println(solution(listOf("a", "b")))
}

//val newList = list.filter { it == "a" || it == "b" }
//val numOfAs = list.count { it == "a" }.toDouble()
//return if ((list == newList) && ("a" in list) && ("b" in list)) {
//    numOfAs / list.size
//} else -1.0

//fun solution(list: List<String>) = if ("a" in list && "b" in list)
//    list.filter { it == "a" || it == "b" }.count { it == "a" } / list.size.toDouble() else -1.0


//fun solution(list: List<String>) = if ("a" in list && "b" in list && list.all { it == "a" || it == "b" })
//    list.filter { it == "a" || it == "b" }.count { it == "a" } / list.size.toDouble() else -1.0


//latest enhanced solution
//fun solution(list: List<String>) = if ("a" in list && "b" in list && list.all { it == "a" || it == "b" })
//    list.count { it == "a" } / list.size.toDouble() else -1.0