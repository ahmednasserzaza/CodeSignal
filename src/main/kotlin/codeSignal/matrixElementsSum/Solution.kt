package codeSignal.matrixElementsSum
fun solution(matrix: List<List<Int>>) =
    matrix[0].indices.sumOf { c -> matrix.indices.map { matrix[it][c] }.takeWhile { it > 0 }.sum() }

/*
fun solution(matrix: List<List<Int>>):Int{
    var result = 0
    for (i in 0 until matrix[0].size){
        for (j in matrix.indices){
            result += matrix[j][i]
            if (matrix[j][i] == 0) break
        }
    }
    return result
}
 */