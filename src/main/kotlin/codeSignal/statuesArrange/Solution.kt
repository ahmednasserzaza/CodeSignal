package codeSignal.statuesArrange

fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    var count = 0
    for (i in 1 until statues.size){
        val different = statues[i] - statues[i-1]
        if (different > 1) count += different -1
    }
    return count
}

fun main() {
    println(solution(mutableListOf(6, 2, 3, 8)))
}

/*
fun solution(statues: MutableList<Int>): Int {
    val missed: MutableList<Int> = mutableListOf()
    val maxStatue = statues.max()
    val miniStatue = statues.min()
    for (i in miniStatue..maxStatue) {
        if (i !in statues) missed.add(i)
    }
    return missed.size
}
 */