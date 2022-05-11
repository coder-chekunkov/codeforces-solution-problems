package `867A`

import java.util.*

private val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val str = scanner.next()

    if (str[0] == 'S' && str[n - 1] == 'F') print("YES")
    else print("NO")
}