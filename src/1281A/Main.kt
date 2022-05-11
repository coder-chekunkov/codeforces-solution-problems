package `1281A`

import java.util.*
private val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()

    for (i in 1..n) {
        val str = scanner.next()
        val c = str[str.length - 1]
        println(solution(c))
    }
}

fun solution(c: Char): String {

    return when (c) {
        'o' -> "FILIPINO"
        'u' -> "JAPANESE"
        'a' -> "KOREAN"
        else -> "-"
    }
}
