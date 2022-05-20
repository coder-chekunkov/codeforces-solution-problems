package `520A`

import java.util.*
import kotlin.collections.HashSet

private var scanner = Scanner(System.`in`)

fun main() {
    scanner.nextInt()
    var str = scanner.next()
    str = str.lowercase()
    val dictionary = HashSet<Char>()

    for (i in str.indices) dictionary.add(str[i])

    if (dictionary.size == 26) print("YES")
    else print("NO")

}