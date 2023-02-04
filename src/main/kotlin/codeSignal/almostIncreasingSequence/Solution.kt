package codeSignal.almostIncreasingSequence

fun solution(sequence: MutableList<Int>) =
    (1 until sequence.size).count { i -> sequence[i - 1] >= sequence[i] } <= 1 &&
    (2 until sequence.size).count { i -> sequence[i - 2] >= sequence[i] } <= 1

fun main() {
    println(solution(mutableListOf(1, 3, 2, 1)))
}

/*
fun solution(sequence: MutableList<Int>): Boolean {
    var count1 = 0 ; var count2 = 0
    for (i in 0 until sequence.size-1){
        if(sequence[i] >= sequence[i+1]) count1++
    }
    for (i in 0 until sequence.size-2){
        if(sequence[i] >= sequence[i+2]) count2++
    }
    return (count1 <=1) && (count2 <= 1)
}
 */