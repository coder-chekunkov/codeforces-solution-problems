package `1041A`

import java.util.*
import kotlin.collections.ArrayList

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val mas = ArrayList<Int>()
    for (i in 1..n) mas.add(scanner.nextInt())
    mas.sort()
    val buff = mas[mas.size - 1] - mas[0] + 1
    println(buff - mas.size)
}
