package `231A`

import java.util.*

private val scanner = Scanner(System.`in`)
private var kol = 0

fun main() {
    val n = scanner.nextInt()
    for (i in 1..n) solution()
    print(kol)
}

private fun solution() {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a + b + c >= 2) kol += 1
}