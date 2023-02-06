package codeSignal.commonCharacterCount

import kotlin.math.min

fun solution(s1: String, s2: String) =
    ('a'..'z').sumOf { c -> min(s1.count { it == c }, s2.count { it == c }) }

fun main() {
    println(solution("aabcc", "adcaa"))
}