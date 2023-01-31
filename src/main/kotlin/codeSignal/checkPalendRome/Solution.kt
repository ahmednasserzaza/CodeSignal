package codeSignal.checkPalendRome

fun solution(inputString: String): Boolean {
    val reversedString = inputString.reversed()
    return inputString == reversedString
}

fun main() {
    println(solution("aaba"))
}