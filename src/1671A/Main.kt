package `1671A`

import java.util.*

private var scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    for (i in 1..n) println(solution())
}

private fun solution(): String{
    val str = scanner.next()
    var buff = true

    for (i in str.indices) {
        if ((i == 0 || str[i] != str[i - 1]) && (i == str.length - 1 || str[i] != str[i + 1])) buff = false
    }

    return if (buff) "YES"
    else "NO"

}