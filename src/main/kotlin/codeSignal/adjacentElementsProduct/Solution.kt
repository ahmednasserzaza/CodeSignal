package codeSignal.adjacentElementsProduct

fun solution(inputArray: MutableList<Int>): Int {
    var max = -1000
    for (i in 0 until inputArray.size-1){
        val result = inputArray[i] * inputArray[i+1]
        if (result > max) max = result
    }
    return max
}

fun main() {
    println(solution(mutableListOf(3, 6, -2, -5, 7, 3)))
}