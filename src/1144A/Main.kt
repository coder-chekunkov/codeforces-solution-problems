package `1144A`

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

private var scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    for (i in 1..n) solution()
}

private fun solution() {
    val str = scanner.next()
    val dictionary = HashSet<Char>()
    val idOfChars = ArrayList<Int>()
    var isOk = true

    if (str.length == 1) println("Yes")
    else {
        for (element in str) {
            dictionary.add(element)
            idOfChars.add(element.code)
        }
        idOfChars.sort()
        isOk = idOfChars[idOfChars.size - 1] - idOfChars[0] + 1 == idOfChars.size

        if (dictionary.size == str.length && isOk) println("Yes")
        else println("No")
    }
}