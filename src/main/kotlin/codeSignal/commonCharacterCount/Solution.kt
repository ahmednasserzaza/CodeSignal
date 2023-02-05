package codeSignal.commonCharacterCount

import kotlin.math.min

fun solution(s1: String, s2: String) =
    ('a'..'z').sumOf { c -> min(s1.count { it == c }, s2.count { it == c }) }


fun main() {
    println(solution("aabcc", "adcaa"))
}
//('a'..'z').map{c -> Math.min(a.count{it == c}, b.count{it == c})}.sum()
/*
fun solution(s1: String, s2: String): Int {
    val list:MutableList<Char> = mutableListOf()
    var c:Char
    var count = 0
    for (i in s1.toCharArray()) list.add(i)
    for (i in s2.indices){
        c = s2.toCharArray()[i]
        if (list.contains(c)){
            list.remove(c)
            count++
        }
    }
    return count
}
 */