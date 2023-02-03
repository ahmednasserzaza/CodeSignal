package codeSignal.theChanceFirstChallenge

/**
 * This function used to calculate number of a's in the list
 * @param list this list of Strings is inserted by user
 * @see list contains only "a" and "b" and it must contain both "a" and "b"
 * @return percentage of "a" into Float number in list while the condition is true , else it returns -1.0
 */
fun solution(list:List<String>) = if ("a" in list && "b" in list && list.all { it in "a".."b" })
    list.count { it == "a" } / (list.size + 0f) else -1f

fun main() {
    println(solution(mutableListOf()))
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
//    list.count { it == "a" } / list.size.toFloat() else -1f


// Enhanced Solution
//fun solution(list:List<String>) = if ("a" in list && "b" in list && list.all { it in "a".."b" })
//    list.count { it == "a" } / list.size.toFloat() else -1f