package `47A`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    println(solution(n))
}

fun solution(n: Int): String {
    for (i in 1..n) {
        if (i * (i + 1) / 2 == n) return "YES"
    }
    return "NO"
}