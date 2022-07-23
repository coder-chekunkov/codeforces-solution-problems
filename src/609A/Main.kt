package `609A`

import java.util.*

private val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    var m = scanner.nextInt()
    val list = ArrayList<Int>()
    for (i in 1..n) list.add(scanner.nextInt())
    list.sort()
    list.reverse()

    var buffCounter = 0
    var ans = 0
    while (m > 0) {
        m -= list[buffCounter]
        buffCounter += 1
        ans += 1
    }
    println(ans)
}