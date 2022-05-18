package `71A`

import java.util.*

private val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    for (i in 1..n) solution()
}

private fun solution() {
    var str = scanner.next()
    val len = str.length

    if (len > 10) {
        str = str[0].toString() + (len - 2).toString() + str[len - 1].toString()
    }

    println(str)
}