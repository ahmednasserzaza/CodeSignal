package codeSignal.sortByHeight


fun solution(a: MutableList<Int>): MutableList<Int> {
    val listWithoutTrees  = a.filter { it != -1 }.sorted()
    var j = 0
    for (i in 0 until a.size){
        if(a[i] != -1){
            a[i] = listWithoutTrees[j]
            j++
        }
    }
    return a
}

fun main() {
    println(solution(mutableListOf(-1, 150, 190, 170, -1, -1, 160, 18)))
}