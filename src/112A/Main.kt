package `112A`

import java.util.*

private var scanner = Scanner(System.`in`)

fun main() {
    var a = scanner.next()
    var b = scanner.next()
    var sum = 0
    a = a.lowercase()
    b = b.lowercase()

    for (i in a.indices) {
        if (a[i] > b[i]) {
            sum = 1
            break
        }
        if (a[i] < b[i]) {
            sum = -1
            break
        }
    }

    print(sum)

}