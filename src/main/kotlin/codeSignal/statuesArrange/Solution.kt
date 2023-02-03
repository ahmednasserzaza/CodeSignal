package codeSignal.statuesArrange

fun solution(statues: MutableList<Int>): Int {
    val missed: MutableList<Int> = mutableListOf()
    val maxStatue = statues.max()
    val miniStatue = statues.min()

    for (i in miniStatue..maxStatue) {
        if (i !in statues) missed.add(i)
    }
    return missed.size
}

fun main() {
    println(solution(mutableListOf(6, 2, 3, 8)))
}