package codeSignal.centuryFromYear

fun centuryFromYear(year: Int) = if (year % 100 == 0) year / 100 else (year / 100) + 1

fun main() {
    println(centuryFromYear(2009))
}