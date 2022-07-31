package `61A`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str1 = scanner.nextLine()
    val str2 = scanner.nextLine()

    println(solution(str1, str2))
}

private fun solution(str1: String, str2: String): String {
    var ansStr = ""

    for (i in str1.indices) {
        ansStr += if (str1[i].code != str2[i].code) "1" else "0"
    }

    return ansStr
}