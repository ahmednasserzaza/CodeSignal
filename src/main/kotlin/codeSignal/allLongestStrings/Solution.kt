package codeSignal.allLongestStrings


fun solution(inputArray: List<String>) = inputArray.filter { it.length == inputArray.maxOf {it.length } }

fun main() {
    println(solution(listOf("aba", "aa", "ad", "vcd", "aba")))
}

//fun solution(inputArray: List<String>) = inputArray.filter { it.length == inputArray.max().length }