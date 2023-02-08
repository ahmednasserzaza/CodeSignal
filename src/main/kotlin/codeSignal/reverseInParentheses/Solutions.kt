package codeSignal.reverseInParentheses

fun solution(inputString: String): String {
    var result = inputString
    var openParenthesisIndex = result.lastIndexOf('(') // foo(bar(baz))blim   it will get the last index of (

    while (openParenthesisIndex >= 0) {
        val closeParenthesisIndex = result.indexOf(')', openParenthesisIndex)
        result = result.replace(
            result.substring(openParenthesisIndex, closeParenthesisIndex + 1),
            result.substring(openParenthesisIndex + 1, closeParenthesisIndex).reversed()
        )
        openParenthesisIndex = result.lastIndexOf('(')
        // for new result foo(barzab)blim and last one would be foobazrabblim then there is no ( it will end loop
    }

    return result
}

fun main() {
    println(solution("foo(bar(baz))blim"))
}