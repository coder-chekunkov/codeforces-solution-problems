package `158A`

import java.util.*

private val scanner = Scanner(System.`in`)
private var kol = 0
private var number = 0
private var mas = ArrayList<Int>()

fun main() {
    val n = scanner.nextInt()
    val k = scanner.nextInt()

    for (i in 1..n) mas.add(scanner.nextInt())
    number = mas[k - 1]
    for (i in mas) if (i >= number && i != 0) kol += 1
    print(kol)
}