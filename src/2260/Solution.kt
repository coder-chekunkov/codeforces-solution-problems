package `2260`

import java.util.*

class Solution {
    fun minimumCardPickup(cards: IntArray): Int {
        val lastIdx = IntArray(1000001)
        Arrays.fill(lastIdx, -1)
        var minLen = Int.MAX_VALUE
        for (i in cards.indices) {
            if (lastIdx[cards[i]] != -1) {
                minLen = Math.min(minLen, i - lastIdx[cards[i]] + 1)
            }
            lastIdx[cards[i]] = i
        }
        return if (minLen == Int.MAX_VALUE) -1 else minLen
    }
}