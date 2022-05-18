package `4A`

import java.util.*

private val scanner = Scanner(System.`in`)

fun main() {
    val w = scanner.nextInt()
    if (w % 2 != 0 || w == 2) println("NO")
    else println("YES")
}