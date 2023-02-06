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
    val value = "$n"
    val half = value.length/2
    var piece1 = 0
    var piece2 = 0

    for(i in 0 until value.length)
    {
        if(i < half)
        {
            piece1 += value[i].toInt()
        }
        else
        {
            piece2 += value[i].toInt()
        }
    }

    return piece1 == piece2
}
 */
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