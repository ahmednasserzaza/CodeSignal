package codeSignal.isLucky


fun solution(n: Int): Boolean {
    val s = n.toString()
    val mid = s.length / 2

    return s.dropLast(mid).chars().sum() == s.drop(mid).chars().sum()
}

fun main() {
    println(solution(1230))
}


/*
fun solution(n: Int): Boolean {
    val nStr = n.toString()
    val firstHalf = nStr.substring(0, nStr.length / 2)
    val secondHalf = nStr.substring(nStr.length / 2)
    var (first , second) = 0 to 0
    for (i in firstHalf.indices){
        first += Integer.parseInt(firstHalf[i].toString())
        second += Integer.parseInt(secondHalf[i].toString())
    }
    return first ==second
}
 */